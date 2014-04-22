package sample_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
 
public class JustPostTwitter {
	 public static void main( String[] args ) throws TwitterException, IOException{
		 
		 Twitter twitter = TwitterFactory.getSingleton();
		 twitter.setOAuthConsumer("RThyCwQoq5mra6FC36fUaThNu", "VtYrzJRveASPklxpQEvi7YgF9OqtVv5xl2VWJ0pXn0aOsAMxc5");
		  
		 RequestToken requestToken = twitter.getOAuthRequestToken();
		 //ここを直す
		 System.out.println(
		     "AuthorizationUrl:" + requestToken.getAuthorizationURL());  
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String pin = br.readLine();
		        
		 AccessToken accessToken = twitter.getOAuthAccessToken(requestToken, pin);
		 twitter.setOAuthAccessToken(accessToken);
		 Status status = twitter.updateStatus(
		       "test from twitter4J " + System.currentTimeMillis());    
	 }
}