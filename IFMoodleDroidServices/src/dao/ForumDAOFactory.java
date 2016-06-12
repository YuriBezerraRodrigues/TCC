package dao;

public class ForumDAOFactory {
	
	
	public static ForumDAOFactory forumDAOFactory;
	private ForumDAO forumDAO;
	
	public static ForumDAOFactory getInstance(){
		if(forumDAOFactory == null){
			forumDAOFactory = new ForumDAOFactory();
		}
		return forumDAOFactory;
	}
	
	public ForumDAO getDAO(){
		if(forumDAO == null){
			forumDAO = new ForumDAO();
		}
		return forumDAO;
	}

}
