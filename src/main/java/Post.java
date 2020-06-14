public class Post {

    private String postText;
    private String authorId ;
    private int privacy;
    private int id = 0;


    public Post(String postText, String authorId, int privacy,int id) {
        this.postText = postText;
        this.authorId = authorId;
        this.privacy = privacy;
        this.id = id;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public int getPrivacy() {
        return privacy;
    }

    public void setPrivacy(int privacy) {
        this.privacy = privacy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
