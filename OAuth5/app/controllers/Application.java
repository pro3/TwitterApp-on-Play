package controllers;

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
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() throws TwitterException {
    	
    	 Twitter twitter = TwitterFactory.getSingleton();
		 twitter.setOAuthConsumer("RThyCwQoq5mra6FC36fUaThNu", "VtYrzJRveASPklxpQEvi7YgF9OqtVv5xl2VWJ0pXn0aOsAMxc5");
		  
		 RequestToken requestToken = twitter.getOAuthRequestToken();
		 return redirect(requestToken.getAuthorizationURL());
    }

}
