package shuzu;

import java.util.Arrays;

import java.util.Scanner;

public class ArraysDelete { public static void main(String[] args) {

//ɾ�������е�ĳһ��Ԫ�صķ�����

//�����һ��Ԫ�����ָ����Ԫ�أ�Ȼ����������

Scanner sc =new Scanner(System.in);

int[] arr = new int[]{1,2,4,5,9,8,0};

System.out.println(Arrays.toString(arr));

System.out.println("������Ҫɾ���ڼ���Ԫ�أ�");

int n = sc.nextInt(); sc.close();

//�����һ��Ԫ�����ָ����Ԫ��

arr[n-1] = arr[arr.length-1];

//��������

arr = Arrays.copyOf(arr, arr.length-1);

System.out.println(Arrays.toString(arr));

} }

