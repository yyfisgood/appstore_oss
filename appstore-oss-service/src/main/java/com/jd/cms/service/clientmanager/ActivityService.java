package com.jd.cms.service.clientmanager;

import com.jd.cms.domain.clientmanager.Activity;
import com.jd.cms.domain.clientmanager.ActivityChannel;
import com.jd.common.web.result.Result;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-7
 * Time: 下午12:11
 * To change this template use File | Settings | File Templates.
 */
public interface ActivityService {
    /**
     * 获得活动列表
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    Result getActivityList(int pageIndex, int pageSize);

    /**
     * 创建活动
     *
     * @param activity
     */
    void createActivity(Activity activity);


    /**
     * 查看是否存在该排序的活动
     *
     * @param seq
     * @return
     */
    Integer findActivityBySeq(Integer seq);

    /**
     * 将所以排序数量加一---从中间插入一条数据
     *
     * @param seq
     */
    void updateActivitySeq(Integer seq);

    /**
     * 当删除一条活动时候，所有的活动排序减一
     *
     * @param seq
     */
    void updateDelActivitySeq(Integer seq);


    /**
     * 删除活动
     *
     * @param Id
     */
    void deletActivity(Integer Id, Integer seq);


    /**
     * 更新活动上下线
     *
     * @param activity
     */
    void updateActivityPubedStatus(Activity activity);


    /**
     * 得到活动详情
     *
     * @param activity
     * @return
     */
    Result getActivityById(Activity activity);


    /**
     * 更新活动详情
     *
     * @param activity
     */
    void updateActivity(Activity activity);


    /**
     * 修改排序
     *
     * @param activity
     */
    void updateActivitySeqBySeq(Activity activity);

    /**
     * 得到渠道关联信息
     *
     * @param activityId
     * @return
     */
    Result activityReleanceChannel(Integer activityId);


    /**
     * 创建活动关联信息
     *
     * @param activityChannel
     */
    void createActivityReleanceChannel(ActivityChannel activityChannel);

}
