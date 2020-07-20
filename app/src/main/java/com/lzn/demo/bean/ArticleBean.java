package com.lzn.demo.bean;

import java.util.List;

/**
 * Created by 哼哼
 * Date：2020/7/19 19:48
 * Desc:
 */
public class ArticleBean {

    /**
     * curPage : 1
     * datas : [{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14380,"link":"https://mp.weixin.qq.com/s/Dc9h48oNsh82I760U1OdYg","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1594915200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594999655000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"关于Android 抓包 与 反抓包","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14363,"link":"https://mp.weixin.qq.com/s/mzIonVXczvFX3RTPXXMakw","niceDate":"2020-07-16 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1594828800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594910630000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"直面底层：你真的了解 View.post() 原理吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14346,"link":"https://mp.weixin.qq.com/s/prctAxg1qh0XOM6ct8-zOQ","niceDate":"2020-07-15 00:00","niceShareDate":"2020-07-15 23:18","origin":"","prefix":"","projectLink":"","publishTime":1594742400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594826288000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"新技术： Fragment 间通信的新方式","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14302,"link":"https://mp.weixin.qq.com/s/xqrGukIqA2zpGsGzah2EzA","niceDate":"2020-07-14 00:00","niceShareDate":"2020-07-14 22:00","origin":"","prefix":"","projectLink":"","publishTime":1594656000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594735213000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"吹爆系列：深入实战Android卡顿优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14280,"link":"https://mp.weixin.qq.com/s/wjp0rBHr_Da1b0huQ3Aqmw","niceDate":"2020-07-13 00:00","niceShareDate":"2020-07-13 22:32","origin":"","prefix":"","projectLink":"","publishTime":1594569600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594650752000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"让那个被Layout Inspector 替代的 Android Device Monitor回归！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14279,"link":"https://mp.weixin.qq.com/s/kEVyiqC4z9ewPfxzh6Pfmg","niceDate":"2020-07-12 00:00","niceShareDate":"2020-07-13 22:32","origin":"","prefix":"","projectLink":"","publishTime":1594483200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594650730000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"起飞！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14254,"link":"https://mp.weixin.qq.com/s/psrDADxwl782Fbs_vzxnQg","niceDate":"2020-07-10 00:00","niceShareDate":"2020-07-10 23:33","origin":"","prefix":"","projectLink":"","publishTime":1594310400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594395237000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android UI 渲染机制的演进，你需要了解什么？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14241,"link":"https://mp.weixin.qq.com/s/0ehKdZdunsuU94aGaHifyg","niceDate":"2020-07-09 00:00","niceShareDate":"2020-07-09 22:49","origin":"","prefix":"","projectLink":"","publishTime":1594224000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594306172000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这交互炸了系列： 仿微信键盘弹出体验","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14227,"link":"https://mp.weixin.qq.com/s/bhECYxxqlE5FsIRmKdAIWg","niceDate":"2020-07-08 00:00","niceShareDate":"2020-07-08 23:38","origin":"","prefix":"","projectLink":"","publishTime":1594137600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594222738000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Jetpack 更新成员 AndroidX App Startup 实践以及原理分析","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14210,"link":"https://mp.weixin.qq.com/s/cvRD1rstDkitm-HflwiFnQ","niceDate":"2020-07-07 00:00","niceShareDate":"2020-07-07 22:35","origin":"","prefix":"","projectLink":"","publishTime":1594051200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594132549000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"解密 RxJava 的异常处理机制，不是你想的那么简单！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14188,"link":"https://mp.weixin.qq.com/s/ZXqrrX2HdcodIc5r0sf7tA","niceDate":"2020-07-06 00:00","niceShareDate":"2020-07-06 20:26","origin":"","prefix":"","projectLink":"","publishTime":1593964800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594038363000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"技巧篇 | 使用 ProcessLifecycle 优雅地监听应用前后台切换","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14187,"link":"https://mp.weixin.qq.com/s/KUc_NA_zlUTYwPdfETGWzA","niceDate":"2020-07-05 00:00","niceShareDate":"2020-07-06 20:25","origin":"","prefix":"","projectLink":"","publishTime":1593878400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1594038342000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这些开源知识，你都要知道！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14135,"link":"https://mp.weixin.qq.com/s/K_PQkGihQXSzOjsme90wxA","niceDate":"2020-07-02 00:00","niceShareDate":"2020-07-03 00:08","origin":"","prefix":"","projectLink":"","publishTime":1593619200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593706125000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这交互炸了系列：仿小米音乐歌手详情页，自定义 Behavior实战","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14106,"link":"https://mp.weixin.qq.com/s/ILuXnH-GUlDhIeO3zfuChg","niceDate":"2020-06-30 00:00","niceShareDate":"2020-06-30 23:18","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530316000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"小厂跳大厂,我是如何拿到腾讯头条美团小米的offer的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14083,"link":"https://mp.weixin.qq.com/s/fBSvptkKH_o1UcctI0GRhg","niceDate":"2020-06-29 00:00","niceShareDate":"2020-06-29 22:25","origin":"","prefix":"","projectLink":"","publishTime":1593360000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593440743000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"聊聊 Android 开发的现状和思考","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14073,"link":"https://mp.weixin.qq.com/s/J9JpB-y9OCdsT8IednLK4Q","niceDate":"2020-06-28 00:00","niceShareDate":"2020-06-28 23:01","origin":"","prefix":"","projectLink":"","publishTime":1593273600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593356511000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"入职三个月，游戏SDK开发总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14037,"link":"https://mp.weixin.qq.com/s/JUnl8FMjkEF5Ax_nEnJybw","niceDate":"2020-06-24 00:00","niceShareDate":"2020-06-24 21:53","origin":"","prefix":"","projectLink":"","publishTime":1592928000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593006822000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"拖更了三年，带回了一个非常好用的库","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14028,"link":"https://mp.weixin.qq.com/s/trAxRzz573TFyJk2klKdag","niceDate":"2020-06-23 00:00","niceShareDate":"2020-06-23 23:29","origin":"","prefix":"","projectLink":"","publishTime":1592841600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1592926197000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"吹爆系列：深度探索 Gradle 自动化构建技术","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13996,"link":"https://mp.weixin.qq.com/s/KkjwVVLWdSU9Uic9NKuGuw","niceDate":"2020-06-21 00:00","niceShareDate":"2020-06-22 20:34","origin":"","prefix":"","projectLink":"","publishTime":1592668800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1592829295000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android新技术了解：Jetpack Compose 更新，Preview2发布","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13957,"link":"https://mp.weixin.qq.com/s/SOTUCM3NdVpzSD757zHm9A","niceDate":"2020-06-19 00:00","niceShareDate":"2020-06-19 21:53","origin":"","prefix":"","projectLink":"","publishTime":1592496000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1592574798000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"打破你的认知，Java除以0一定会崩溃吗？","type":0,"userId":-1,"visible":1,"zan":0}]
     * offset : 0
     * over : false
     * pageCount : 49
     * size : 20
     * total : 967
     */

    private int curPage;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;
    private List<DatasBean> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * apkLink :
         * audit : 1
         * author : 鸿洋
         * canEdit : false
         * chapterId : 408
         * chapterName : 鸿洋
         * collect : false
         * courseId : 13
         * desc :
         * descMd :
         * envelopePic :
         * fresh : false
         * id : 14380
         * link : https://mp.weixin.qq.com/s/Dc9h48oNsh82I760U1OdYg
         * niceDate : 2天前
         * niceShareDate : 1天前
         * origin :
         * prefix :
         * projectLink :
         * publishTime : 1594915200000
         * realSuperChapterId : 407
         * selfVisible : 0
         * shareDate : 1594999655000
         * shareUser :
         * superChapterId : 408
         * superChapterName : 公众号
         * tags : [{"name":"公众号","url":"/wxarticle/list/408/1"}]
         * title : 关于Android 抓包 与 反抓包
         * type : 0
         * userId : -1
         * visible : 1
         * zan : 0
         */

        private String apkLink;
        private int audit;
        private String author;
        private boolean canEdit;
        private int chapterId;
        private String chapterName;
        private boolean collect;
        private int courseId;
        private String desc;
        private String descMd;
        private String envelopePic;
        private boolean fresh;
        private int id;
        private String link;
        private String niceDate;
        private String niceShareDate;
        private String origin;
        private String prefix;
        private String projectLink;
        private long publishTime;
        private int realSuperChapterId;
        private int selfVisible;
        private long shareDate;
        private String shareUser;
        private int superChapterId;
        private String superChapterName;
        private String title;
        private int type;
        private int userId;
        private int visible;
        private int zan;
        private List<TagsBean> tags;

        public String getApkLink() {
            return apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public int getAudit() {
            return audit;
        }

        public void setAudit(int audit) {
            this.audit = audit;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public boolean isCanEdit() {
            return canEdit;
        }

        public void setCanEdit(boolean canEdit) {
            this.canEdit = canEdit;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public boolean isCollect() {
            return collect;
        }

        public void setCollect(boolean collect) {
            this.collect = collect;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDescMd() {
            return descMd;
        }

        public void setDescMd(String descMd) {
            this.descMd = descMd;
        }

        public String getEnvelopePic() {
            return envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public boolean isFresh() {
            return fresh;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getNiceShareDate() {
            return niceShareDate;
        }

        public void setNiceShareDate(String niceShareDate) {
            this.niceShareDate = niceShareDate;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getProjectLink() {
            return projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getRealSuperChapterId() {
            return realSuperChapterId;
        }

        public void setRealSuperChapterId(int realSuperChapterId) {
            this.realSuperChapterId = realSuperChapterId;
        }

        public int getSelfVisible() {
            return selfVisible;
        }

        public void setSelfVisible(int selfVisible) {
            this.selfVisible = selfVisible;
        }

        public long getShareDate() {
            return shareDate;
        }

        public void setShareDate(long shareDate) {
            this.shareDate = shareDate;
        }

        public String getShareUser() {
            return shareUser;
        }

        public void setShareUser(String shareUser) {
            this.shareUser = shareUser;
        }

        public int getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class TagsBean {
            /**
             * name : 公众号
             * url : /wxarticle/list/408/1
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }


}