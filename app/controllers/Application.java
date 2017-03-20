package controllers;

import play.*;
import play.libs.WS;
import play.libs.WS.HttpResponse;
import play.mvc.*;

import java.util.*;

import com.google.gson.JsonElement;

import models.*;

public class Application extends Controller {

    public static void index() {
        HttpResponse res = WS.url("https://www.reddit.com/new.json").get();
        
        int status = res.getStatus();
        String contentType = res.getContentType();
        
        JsonElement json = res.getJson();
    	
    	render(status, contentType, json);
    }

}