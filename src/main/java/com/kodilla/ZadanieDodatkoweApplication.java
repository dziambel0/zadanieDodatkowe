package com.kodilla;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ZadanieDodatkoweApplication {

	public static void main(String[] args) {

		int a = 1;
		int b = 20;
		int x = 3;

		List<Integer> listaCyfr = new ArrayList<>();

		Sprawdzanie sprawdzenie = new Sprawdzanie();
		listaCyfr = sprawdzenie.sprawdzaniePodzielnosci(a,b,x);

		System.out.println(listaCyfr.size());
		System.out.println(listaCyfr);

	}

}
