package com.jso.Arraylist;

public class MyArrayList 
{
   private Object [] a=new Object[5]; 
   private int p=0;
   public void add(Object e)
   {
	   if(p>=a.length)increase();
	   a[p]=e;
	   p++;
   }
   public void add(int index,Object e) 
   {
	if (index <-1||index>=size())
	{
		throw new IndexOutOfBoundsException();
	}
	if (p>=a.length)increase();
	for(int i=size()-1;i>index;i--)
	{
		a[i+1]=a[i];
	}
	a[index]=e;
	p++;
   }
   
private void increase() 
{
	Object[] temp=new Object[a.length+3];
	for(int i=0;i<a.length; i++)
	{
		temp [i] =a[i];
	}
	a=temp;
	
}
int size() {
	return p;
}
public Object get(int index)
{
	if(index<=1||index>=size())
	{
		throw new IndexOutOfBoundsException();
		
	}
	return a[index];
}
public void remove(int index) 
{
	if(index<=1||index>=size())
	{
		throw new IndexOutOfBoundsException();
		
	}
	for(int i=0;i<a.length;i++)
	{
		a[i-1]=a[i];
		
	}
//	p--;
	a[p--]=null;
}
public void clear()
{
	a=new Object[5];
	p=0;
}
@Override
public String toString()
{
	if(size()==0)return "[]";
	String s="[" +a[0];
	for(int i=0;i<size();i++)
	{
		s=s+","+a[i];
	}
	s=s+"]";
	return s;
}

   
}
