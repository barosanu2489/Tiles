package com.barosanu.model.beans;

import java.util.List;

public class ProgramUser {

	private String name;
	private String password;

	private List<Integer> programariSapt0;// saptamana curenta
	private List<Integer> programariSapt1;// saptamana viitoare
	private List<Integer> programariSapt2;// peste doua saptamani
	private List<Integer> programariSapt3;// peste 3 saptamanani

}
