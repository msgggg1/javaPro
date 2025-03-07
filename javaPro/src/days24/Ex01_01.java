package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.TreeMap;

public class Ex01_01 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days18\\Ex10.java"; // 파일 경로
        String line;

        // 'A-Z' + 'a-z' 모든 단어 저장
        TreeMap<Character, ArrayList<String>> wordMap = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                // 1. 알파벳 단어만 남기기 (정규식 사용)
                line = line.replaceAll("[^a-zA-Z]", " "); // 알파벳 외 문자 제거
                String[] words = line.split("\\s+"); // 공백 기준으로 단어 분리

                for (String word : words) {
                    if (!word.isEmpty()) { // 빈 문자열 제외
                        char firstChar = word.charAt(0); // 첫 글자 추출

                        // A-Z, a-z 범위만 저장
                        if ((firstChar >= 'A' && firstChar <= 'Z') || (firstChar >= 'a' && firstChar <= 'z')) {
                            wordMap.putIfAbsent(firstChar, new ArrayList<>()); // 첫 글자 그룹이 없으면 생성
                            if (!wordMap.get(firstChar).contains(word)) { // 중복 방지
                                wordMap.get(firstChar).add(word);
                            }
                        }
                    }
                }
            }

            // 결과 출력
            dispWordsByAlphabet(wordMap);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("end");
        
    } // main

    // 각 알파벳별 단어 개수와 리스트 출력 메서드
    private static void dispWordsByAlphabet(TreeMap<Character, ArrayList<String>> wordMap) {
        for (char key = 'A'; key <= 'Z'; key++) {  // 대문자 A-Z
            printWordList(key, wordMap);
        }
        for (char key = 'a'; key <= 'z'; key++) {  // 소문자 a-z
            printWordList(key, wordMap);
        }
    }

    // 특정 알파벳 그룹에 대한 출력 메서드
    private static void printWordList(char key, TreeMap<Character, ArrayList<String>> wordMap) {
        ArrayList<String> words = wordMap.getOrDefault(key, new ArrayList<>());

        System.out.printf("[%c로 시작하는 단어 -%d개]\n", key, words.size());
        if (!words.isEmpty()) {
            int index = 1;
            for (String word : words) {
                System.out.printf("\t%d. %s\n", index++, word);
            }
        }
        System.out.println("=".repeat(60)); // 구분선
    }



} // class
