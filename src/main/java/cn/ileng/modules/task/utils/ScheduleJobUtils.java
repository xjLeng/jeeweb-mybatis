package cn.ileng.modules.task.utils;

import cn.ileng.modules.task.entity.ScheduleJob;

public class ScheduleJobUtils {
     public static cn.ileng.core.quartz.data.ScheduleJob entityToData(ScheduleJob scheduleJobEntity){
    	 cn.ileng.core.quartz.data.ScheduleJob scheduleJob=new cn.ileng.core.quartz.data.ScheduleJob();
    	 scheduleJob.setBeanClass(scheduleJobEntity.getBeanClass());
    	 scheduleJob.setCronExpression(scheduleJobEntity.getCronExpression());
    	 scheduleJob.setDescription(scheduleJobEntity.getDescription());
    	 scheduleJob.setIsConcurrent(scheduleJobEntity.getIsConcurrent());
    	 scheduleJob.setJobName(scheduleJobEntity.getJobName());
    	 scheduleJob.setJobGroup(scheduleJobEntity.getJobGroup());
    	 scheduleJob.setJobStatus(scheduleJobEntity.getJobStatus());
    	 scheduleJob.setMethodName(scheduleJobEntity.getMethodName());
    	 scheduleJob.setSpringBean(scheduleJobEntity.getSpringBean());
    	 return scheduleJob;
     }
}
