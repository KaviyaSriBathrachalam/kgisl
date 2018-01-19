package com.kgfsl.addarray;

class ArraytoArray{
public static void main(String args[])
{
int[] arr=new int[5];
int[] arr2=new int[5];
arr[0]=0;
arr[1]=2;
arr[2]=4;
arr[3]=6;
arr[4]=8;
arr2[0]=0;
arr2[1]=2;
arr2[2]=4;
arr2[3]=6;
arr2[4]=8;
 for(int i=0;i<arr.length;i++)
 {
 System.out.println(arr[i]);
 }
 for(int i=0;i<arr2.length;i++)
 {
 System.out.println(arr2[i]);
 }
dosum(arr);
dosum(arr2);
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
for(int i=0;i<arr2.length;i++)
{
System.out.println(arr2[i]);
}

}

public static void dosum(int[] arr)
{
for(int i=0;i<arr.length;i++)
{
    arr[i]=arr[i]+2;
}

}
}