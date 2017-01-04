package rsg.controller;

import rsg.model.Generator;
import java.util.Scanner;

public class RSGController
{
	private Generator gen;
	private Scanner userInput;
	private int k;
	
	public RSGController()
	{
		gen = new Generator();
		userInput = new Scanner(System.in);
		k = 1;
	}
	public void start()
	{
		while(k == 1)
		{
			System.out.println("Welcome to the random sentence generator made by Isaac Hill.");
			System.out.println("What would you like to do: Generate or New Word");
			String answer = userInput.nextLine();
			
			if (answer.equalsIgnoreCase("Generate"))
			{
				System.out.println("Here is a random sentence created by me!");
				//Where sentence will go...
				int articleNumber = (int) (Math.random() * gen.getArticleList().size());
				int adjectiveNumber = (int) (Math.random() * gen.getAdjectiveList().size());
				int nounNumber = (int) (Math.random() * gen.getNounList().size());
				int verbNumber = (int) (Math.random() * gen.getVerbList().size());
				System.out.println(gen.getArticleList().get(articleNumber) + " " + 
								   gen.getAdjectiveList().get(adjectiveNumber) + " " +
								   gen.getNounList().get(nounNumber) + " " + 
								   gen.getVerbList().get(verbNumber) + ".");
			}
			else if (answer.equalsIgnoreCase("New Word"))
			{
				System.out.println("For what part of speech would you like to add a word to?");
				System.out.println("Article  Adjective  Noun  Verb?");
				String pOSAnswer = userInput.nextLine();
				
				if (pOSAnswer.equalsIgnoreCase("Article"))
				{
					System.out.println("What word would you like to add to the article list?");
					String articleAnswer = userInput.nextLine();
					gen.getArticleList().add(articleAnswer);
				}
				else if (pOSAnswer.equalsIgnoreCase("Adjective"))
				{
					System.out.println("What word would you like to add to the adjective list?");
					String adjectiveAnswer = userInput.nextLine();
					gen.getAdjectiveList().add(adjectiveAnswer);
				}
				else if (pOSAnswer.equalsIgnoreCase("Noun"))
				{
					System.out.println("What word would you like to add to the noun list?");
					String nounAnswer = userInput.nextLine();
					gen.getNounList().add(nounAnswer);
				}
				else if (pOSAnswer.equalsIgnoreCase("Verb"))
				{
					System.out.println("What word would you like to add to the verb list?");
					String verbAnswer = userInput.nextLine();
					gen.getVerbList().add(verbAnswer);
				}
			}
		}
	}
}
