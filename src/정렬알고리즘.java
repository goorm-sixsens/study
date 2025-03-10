package com.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정렬알고리즘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력할 개수 : ");
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        // 10
        // 10 9 8 7 6 5 4 3 2 1
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < array.length - 1; i++) {
            // 매 회차마다 가장 큰 수를 맨 뒤로 보냄
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        // 선택 정렬    // 5 6 10 20 30
        // 1. 매 회차 가장 작은 수를 찾는다
        // 2. 그 수를 첫 index와 교환
        for (int i = 0; i < array.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
