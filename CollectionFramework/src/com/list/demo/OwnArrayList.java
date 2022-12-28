package com.list.demo;

import java.util.Arrays;

public class OwnArrayList {
	
	private Object[] objects;
	private int actsize=0;
	
	public OwnArrayList(){
		objects=new Object[10];
	}
	
	public void add(Object obj){
		if((objects.length-actsize) < 5){
			increaseArrayListSize();
		}
		
		objects[actsize++]=obj;
		
	}
	public int size(){
		return actsize;
	}
	
	public Object remove(int index){

		if(index<actsize){
			Object object = objects[index];
            objects[index]=null;
			int tmp=index;
			while(tmp<actsize){
				objects[tmp]=objects[tmp+1];
				objects[tmp+1]=null;
				tmp++;
			}
				actsize--;
				return object;
				
			}else{
				throw new ArrayIndexOutOfBoundsException();
			
		}
		
	}

	public Object get(int index){
		if(index<actsize)
		 return objects[index];
		else
			 throw new ArrayIndexOutOfBoundsException();
		
	}
	private void increaseArrayListSize() {
		// TODO Auto-generated method stub
		 objects = Arrays.copyOf(objects, objects.length*2);
		 System.out.println("new length "+objects.length);
		
	}

	public static void main(String[] args) {
		
		OwnArrayList mal = new OwnArrayList();
	        mal.add(new Integer(2));
	        mal.add(new Integer(5));
	        mal.add(new Integer(1));
	        mal.add(new Integer(23));
	        mal.add(new Integer(14));
	        mal.add(new Integer(2));
	        mal.add(new Integer(5));
	        mal.add(new Integer(1));
	        mal.add(new Integer(23));
	        mal.add(new Integer(14));
	        for(int i=0;i<mal.size();i++){
	            System.out.print(mal.get(i)+" ");
	        }
	        mal.add(new Integer(29));
	        System.out.println("Element at Index 5:"+mal.get(5));
	        System.out.println("List size: "+mal.size());
	        System.out.println("Removing element at index 2: "+mal.remove(2));
	        for(int i=0;i<mal.size();i++){
	            System.out.print(mal.get(i)+" ");
	        }

	}

}
