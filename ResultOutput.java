package learning;

import java.util.List;
import java.util.Map;

public class ResultOutput {
	static void doingExercisesAndTests(String nameOfExercise){
		System.out.println("Doing : " + nameOfExercise);
	}
	static void searchingInternet(String name){
		System.out.println(name + " is searching the Internet");
	}
	static void bookBought(String bookName){
		System.out.println("������� ������ : " + bookName);
	}
	static void analyseTestResult(double result){
		System.out.println("������ �������� " + result + "% �����");
	}
	static void viewActivity(String activity){
		System.out.println(activity);
	}
	static void notesSuccessfullyAdded(String homeWork){
		System.out.println(homeWork);
	}
	static void showAllTests(Map<String, Map<String, Double>> map){
		System.out.println("������� ����� : " + map.toString());
	}
	static void showAllTasks(Map<String, List<String>> map){
		System.out.println("������� �������� : " + map.toString());
	}
	static void doTests(List<String>listOfTests){
		int count = 1;
		System.out.println("������� ����: ");
		for(String test : listOfTests){
			System.out.println(test + " : " + count);
			count++;
		}
	}
	static void chooseBook(List<String> listOfBooks){
		int count = 1;
		System.out.println("������� ������: ");
		for(String book : listOfBooks){
			System.out.println(book + " : " + count);
			count++;
		}
	}
	static void getTestDoneNumb(){
		System.out.println("������� ����, ���� �� ���������.");
	}
	static void getMarkReceived(){
		System.out.println("������ ������� ����, �� �� �������.");
	}
	static void doingExercisesOutput(List<String>listOfExercises){
		int count = 1;
		System.out.println("������� ������: ");
		for(String exercise : listOfExercises){
			System.out.println(exercise + " : " + count);
			count++;
		}
	}
	static void getDateOfTestDone(){
		System.out.println("������ ���� ���������(dd.mm.yyyy)");
	}
	static void getNumbOfTestToWrite(){
		System.out.println("������ ������ �������?");
	}
	static void doingHomeworkOutput(Human human){
		int count = 1;
		System.out.println("������� ����� ��");
		for(Map.Entry<String, List<String>> entry : human.getNotesForHomework().entrySet()){
			System.out.println(count + " : " + entry.getKey() + " " + entry.getValue());
			count++;
		}
	}
	static void getTestData(){
		System.out.println("������ ����� �����, � ��� ������� �������� ���� (� ������ �����)");
	}
	static void getTestsDone(Human human){
		for(String test : human.getTestsDone()){
			System.out.println(test);
		}
	}
}
