
public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this. authorName = authorName;
    this. title = title;
    this. text = text;
    this. publicationDate = publicationDate;
  }
  public void print() {
    System.out.println(authorName);
    System.out.println(title);
    System.out.println(text);
    System.out.println(publicationDate);
  }

  public static void main(String[] args) {
    BlogPost blog1 = new BlogPost("John Doe",
            "Lorem ipsum",
            "Lorem ipsum dolor sit amet.",
            "2000.05.04.");
    blog1.print();
    BlogPost blog2 = new BlogPost("Tim Urban",
            "Wait but why",
            "A popular long-form, stick-figure-illustrated blog about almost everything.",
            "2010.10.10");
    blog2.print();
    BlogPost blog3 = new BlogPost("William Turton",
            "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
            "2017.03.28.");
    blog3.print();
  }

}
