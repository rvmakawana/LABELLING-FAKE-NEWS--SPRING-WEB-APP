package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fake5001")
public class Fake {
	
	@Id
	private int id;
	private String tweetid;	
	private String userid	;
	private String user_display_name	;
	private String user_screen_name	;
	private String user_reported_location;
	private String user_profile_description;	
	private String user_profile_url ;
	private String follower_count	;
	private String following_count	;
	private String account_creation_date;	
	private String account_language	;
	private String tweet_language	;
	private String tweet_text	;
	private String tweet_client_name;	
	private String in_reply_to_tweetid	;
	private String is_retweet	;
	private String retweet_userid	;
	private String retweet_tweetid	;
	private String quote_count	;
	private String reply_count;
	private String like_count;
	private String retweet_count	;
	private String hashtags	;
	private String urls	;
	private String user_mentions ;	
	private String otherlinks	;
	private String otherlinksrank;
	private Integer impac;
	
private Integer impact5	;
	
	private String followbyfollower;

    private String calculate;
    private Integer score;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTweetid() {
		return tweetid;
	}
	public void setTweetid(String tweetid) {
		this.tweetid = tweetid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUser_display_name() {
		return user_display_name;
	}
	public void setUser_display_name(String user_display_name) {
		this.user_display_name = user_display_name;
	}
	public String getUser_screen_name() {
		return user_screen_name;
	}
	public void setUser_screen_name(String user_screen_name) {
		this.user_screen_name = user_screen_name;
	}
	public String getUser_reported_location() {
		return user_reported_location;
	}
	public void setUser_reported_location(String user_reported_location) {
		this.user_reported_location = user_reported_location;
	}
	public String getUser_profile_description() {
		return user_profile_description;
	}
	public void setUser_profile_description(String user_profile_description) {
		this.user_profile_description = user_profile_description;
	}
	public String getUser_profile_url() {
		return user_profile_url;
	}
	public void setUser_profile_url(String user_profile_url) {
		this.user_profile_url = user_profile_url;
	}
	
	public String getFollower_count() {
		return follower_count;
	}
	public void setFollower_count(String follower_count) {
		this.follower_count = follower_count;
	}
	public String getFollowing_count() {
		return following_count;
	}
	public void setFollowing_count(String following_count) {
		this.following_count = following_count;
	}
	public String getAccount_creation_date() {
		return account_creation_date;
	}
	public void setAccount_creation_date(String account_creation_date) {
		this.account_creation_date = account_creation_date;
	}
	public String getAccount_language() {
		return account_language;
	}
	public void setAccount_language(String account_language) {
		this.account_language = account_language;
	}
	public String getTweet_language() {
		return tweet_language;
	}
	public void setTweet_language(String tweet_language) {
		this.tweet_language = tweet_language;
	}
	public String getTweet_text() {
		return tweet_text;
	}
	public void setTweet_text(String tweet_text) {
		this.tweet_text = tweet_text;
	}
	public String getTweet_client_name() {
		return tweet_client_name;
	}
	public void setTweet_client_name(String tweet_client_name) {
		this.tweet_client_name = tweet_client_name;
	}
	public String getIn_reply_to_tweetid() {
		return in_reply_to_tweetid;
	}
	public void setIn_reply_to_tweetid(String in_reply_to_tweetid) {
		this.in_reply_to_tweetid = in_reply_to_tweetid;
	}
	public String getIs_retweet() {
		return is_retweet;
	}
	public void setIs_retweet(String is_retweet) {
		this.is_retweet = is_retweet;
	}
	public String getRetweet_userid() {
		return retweet_userid;
	}
	public void setRetweet_userid(String retweet_userid) {
		this.retweet_userid = retweet_userid;
	}
	public String getRetweet_tweetid() {
		return retweet_tweetid;
	}
	public void setRetweet_tweetid(String retweet_tweetid) {
		this.retweet_tweetid = retweet_tweetid;
	}
	public String getQuote_count() {
		return quote_count;
	}
	public void setQuote_count(String quote_count) {
		this.quote_count = quote_count;
	}
	public String getReply_count() {
		return reply_count;
	}
	public void setReply_count(String reply_count) {
		this.reply_count = reply_count;
	}
	public String getLike_count() {
		return like_count;
	}
	public void setLike_count(String like_count) {
		this.like_count = like_count;
	}
	public String getRetweet_count() {
		return retweet_count;
	}
	public void setRetweet_count(String retweet_count) {
		this.retweet_count = retweet_count;
	}
	public String getHashtags() {
		return hashtags;
	}
	public void setHashtags(String hashtags) {
		this.hashtags = hashtags;
	}
	public String getUrls() {
		return urls;
	}
	public void setUrls(String urls) {
		this.urls = urls;
	}
	public String getUser_mentions() {
		return user_mentions;
	}
	public void setUser_mentions(String user_mentions) {
		this.user_mentions = user_mentions;
	}
	public String getOtherlinks() {
		return otherlinks;
	}
	public void setOtherlinks(String otherlinks) {
		this.otherlinks = otherlinks;
	}
	public String getOtherlinksrank() {
		return otherlinksrank;
	}
	public void setOtherlinksrank(String otherlinksrank) {
		this.otherlinksrank = otherlinksrank;
	}
	public int getImpact5() {
		return impact5;
	}
	public void setImpact5(int impact5) {
		this.impact5 = impact5;
	}
	public String getFollowbyfollower() {
		return followbyfollower;
	}
	public void setFollowbyfollower(String followbyfollower) {
		this.followbyfollower = followbyfollower;
	}
	public String getCalculate() {
		return calculate;
	}
	public void setCalculate(String calculate) {
		this.calculate = calculate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getImpac() {
		return impac;
	}
	public void setImpac(int impac) {
		this.impac = impac;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

}
