package com.collection.BrowserNavigator;

import java.util.Stack;

class Browser {
	private String currenturl;
	private Stack<String> forward;
	private Stack<String> backward;
	
	Browser(){
		this.currenturl=null;
		forward=new Stack<>();
		backward=new Stack<>();
	}

    public void newUrl(String url){
        if(currenturl!=null){
            backward.push(currenturl);
        }
        this.currenturl=url;
        forward.push(currenturl);
    }

    public void moveForward() {
    	System.out.println("PERFORMED FORWARD:"+currenturl);
        if(!forward.isEmpty())
        	currenturl=forward.pop();
        if(currenturl!=null)
        backward.push(currenturl);
    }

    public void moveBackward() {
        System.out.println("PERFORMED BACKWARD:"+currenturl);
        if(!backward.isEmpty())
        	currenturl=backward.pop();
        if(currenturl!=null)
        forward.push(currenturl);
    }
}
