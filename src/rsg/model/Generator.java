package rsg.model;

import java.util.ArrayList;

public class Generator
{
	private ArrayList<String> articleList;
	private ArrayList<String> adjectiveList;
	private ArrayList<String> nounList;
	private ArrayList<String> verbList;
	
	public Generator()
	{
		this.articleList = new ArrayList<String>();
		this.adjectiveList = new ArrayList<String>();
		this.nounList = new ArrayList<String>();
		this.verbList = new ArrayList<String>();
		this.buildAdjectiveList();
		this.buildArticleList();
		this.buildNounList();
		this.buildVerbList();
	}
	
	private void buildArticleList()
	{
		articleList.add("The");
		articleList.add("A");
		articleList.add("This");
		articleList.add("That");
	}
	
	private void buildAdjectiveList()
	{
		adjectiveList.add("lazy");
		adjectiveList.add("sleepy");
		adjectiveList.add("hyper");
		adjectiveList.add("cool");
		adjectiveList.add("lame");
		adjectiveList.add("dopey");
	}
	
	private void buildNounList()
	{
		nounList.add("human");
		nounList.add("dog");
		nounList.add("cat");
		nounList.add("duck");
		nounList.add("cow");
		nounList.add("Isaac");
		nounList.add("Patrick");
		nounList.add("Dunkin");
		nounList.add("Matt");
	}
	
	private void buildVerbList()
	{
		verbList.add("ran");
		verbList.add("walked");
		verbList.add("swam");
		verbList.add("jumped");
	}
	
	public ArrayList<String> getArticleList()
	{
		return articleList;
	}

	public void setArticleList(ArrayList<String> articleList)
	{
		this.articleList = articleList;
	}

	public ArrayList<String> getAdjectiveList()
	{
		return adjectiveList;
	}

	public void setAdjectiveList(ArrayList<String> adjectiveList)
	{
		this.adjectiveList = adjectiveList;
	}

	public ArrayList<String> getNounList()
	{
		return nounList;
	}

	public void setNounList(ArrayList<String> nounList)
	{
		this.nounList = nounList;
	}

	public ArrayList<String> getVerbList()
	{
		return verbList;
	}

	public void setVerbList(ArrayList<String> verbList)
	{
		this.verbList = verbList;
	}
	
	public String toString()
	{
		return "coolio";
	}

}
