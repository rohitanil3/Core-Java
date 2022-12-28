package com.list.demo;

public class OwnStack {
	
	Object[] objects;
	int top;
	int capacity;
	
	public OwnStack(int size) {
		// TODO Auto-generated constructor stub
		capacity=size;
		objects=new Object[size];
		top=-1;
	}
	
	public boolean isfull(){
		if(top==capacity-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty(){
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public void push(Object obj){
		if(!isfull()){
			objects[++top]=obj;
			
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public Object pop(){
		if(!isEmpty()){
		
			return objects[top--];
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public Object peek(){
		return objects[top];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OwnStack stack=new OwnStack(5);
		stack.push(1);
		stack.push(12);

		stack.push(13);
		System.out.println("pop"+stack.pop());
		stack.pop();
		System.out.println("peek"+stack.peek());
        while(!stack.isEmpty()){
        	System.out.println(stack.pop());
        }


	}

}
