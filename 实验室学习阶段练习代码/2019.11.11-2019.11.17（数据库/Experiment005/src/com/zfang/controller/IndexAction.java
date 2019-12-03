package com.zfang.controller;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zfang.entity.Advertisement;
import com.zfang.entity.Channel;
import com.zfang.entity.Message;
import com.zfang.entity.News;
import com.zfang.service.AdvertisementService;
import com.zfang.service.ChannelService;
import com.zfang.service.MessageService;
import com.zfang.service.NewsService;
import com.zfang.service.impl.AdvertisementServiceImpl;
import com.zfang.service.impl.ChannelServiceImpl;
import com.zfang.service.impl.MessageServiceImpl;
import com.zfang.service.impl.NewsServiceImpl;

public class IndexAction extends ActionSupport {
	private NewsService newsService = new NewsServiceImpl();
	private AdvertisementService advertisementService = new AdvertisementServiceImpl();
	private ChannelService channelService = new ChannelServiceImpl();
	private MessageService messageService = new MessageServiceImpl();
	
	public String execute() throws Exception {
		// 准备数据
		// 1、新闻公告、业界动态,只需要显示最新的5条
		List<News> annoList = newsService.findLastFive(0);// type=0是新闻公告
		List<News> fraList = newsService.findLastFive(1);// type=1是业界动态
		ActionContext.getContext().put("annoList", annoList);
		ActionContext.getContext().put("fraList", fraList);

		// 2、广告
		List<Advertisement> advertisementList = advertisementService.findTopFive();
		ActionContext.getContext().put("advertisementList", advertisementList);
		
		// 3、购买专区、免费专区、交换专区、爱心捐赠的简介
		// 3.1购买专区type=0;
		List<Channel> buyChannel = channelService.findAll(0);
		// 3.2交换专区type=1
		List<Channel> swapChannel = channelService.findAll(1);
		// 3.3爱心捐赠type=2
		List<Channel> contriChannel = channelService.findAll(2);
		ActionContext.getContext().put("buyChannel", buyChannel);
		ActionContext.getContext().put("swapChannel", swapChannel);
		ActionContext.getContext().put("contriChannel", contriChannel);

		// 4、留言板
		List<Message> messageList = messageService.findLastFive();
		// 留言的内容长度大于15将，截取12个字符加上省略号
		if(messageList != null && messageList.size() > 0){
			for (Message m : messageList) {
				if (m.getContent().length() > 15) {
					m.setContent(m.getContent().substring(0, 12) + "...");
				}
			}
		}
		ActionContext.getContext().put("messageList", messageList);
		// 5、爱心榜
		// TODO 

		// 6、免费、交换、捐赠专区的部分商品展示
		// TODO 

		// 跳转到首页
		return SUCCESS;
	}
}
