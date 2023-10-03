package com.notecount.main;

import java.util.Scanner;

import com.notecount.countimplementation.NotesCountImplementation;
import com.notecount.mergesort.MergeSortImplementation;

public class NoteCountDriver {
	public static void main(String args[]) {
		System.out.println("enter the size of the denominations");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int notes[] = new int[size];
		
		System.out.println("enter the currency denomination value");
		for(int i = 0; i < size; i++) {
			notes[i] = s.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = s.nextInt();
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		mergeSortImplementation.sort(notes, 0, notes.length-1);
		
		NotesCountImplementation notesCountImplementation = new NotesCountImplementation();
		notesCountImplementation.count(notes, amount);
		
		s.close();
	}
}
