import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class PostModel {

    private String authorName;
    private String authorProfilePicUrl ;
    private String authourId ;
    private String timespan ;
    private String authorFarm ;
    private String postText;
    private List<String> PostImageUrl ;
    private List<String> PostImgstr;
    private int likes;
    private int id ;
    private List<PostCommentsViewModel> postComments ;
    private List<PostImageViemodel> postImages ;
    private FarmProfileModel farmProfile ;
    private boolean isLiked ;
    private String createdDate ;
    private String postonotherUserId;
    private int privacy;
    private List<PostShareViewModel> postShares ;

    public PostModel(String authorName, String authorProfilePicUrl, String authourId, String timespan, String authorFarm, String postText, List<String> postImageUrl, List<String> postImgstr, int likes, int id, List<PostCommentsViewModel> postComments, List<PostImageViemodel> postImages, FarmProfileModel farmProfile, boolean isLiked, String createdDate, String postonotherUserId, int privacy, List<PostShareViewModel> postShares) {
        this.authorName = authorName;
        this.authorProfilePicUrl = authorProfilePicUrl;
        this.authourId = authourId;
        this.timespan = timespan;
        this.authorFarm = authorFarm;
        this.postText = postText;
        this.PostImageUrl = postImageUrl;
        this.PostImgstr = postImgstr;
        this.likes = likes;
        this.id = id;
        this.postComments = postComments;
        this.postImages = postImages;
        this.farmProfile = farmProfile;
        this.isLiked = isLiked;
        this.createdDate = createdDate;
        this.postonotherUserId = postonotherUserId;
        this.privacy = privacy;
        this.postShares = postShares;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorProfilePicUrl() {
        return authorProfilePicUrl;
    }

    public void setAuthorProfilePicUrl(String authorProfilePicUrl) {
        this.authorProfilePicUrl = authorProfilePicUrl;
    }

    public String getAuthourId() {
        return authourId;
    }

    public void setAuthourId(String authourId) {
        this.authourId = authourId;
    }

    public String getTimespan() {
        return timespan;
    }

    public void setTimespan(String timespan) {
        this.timespan = timespan;
    }

    public String getAuthorFarm() {
        return authorFarm;
    }

    public void setAuthorFarm(String authorFarm) {
        this.authorFarm = authorFarm;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public List<String> getPostImageUrl() {
        return PostImageUrl;
    }

    public void setPostImageUrl(List<String> postImageUrl) {
        this.PostImageUrl = postImageUrl;
    }

    public List<String> getPostImgstr() {
        return PostImgstr;
    }

    public void setPostImgstr(List<String> postImgstr) {
        this.PostImgstr = postImgstr;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PostCommentsViewModel> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostCommentsViewModel> postComments) {
        this.postComments = postComments;
    }

    public List<PostImageViemodel> getPostImages() {
        return postImages;
    }

    public void setPostImages(List<PostImageViemodel> postImages) {
        this.postImages = postImages;
    }

    public FarmProfileModel getFarmProfile() {
        return farmProfile;
    }

    public void setFarmProfile(FarmProfileModel farmProfile) {
        this.farmProfile = farmProfile;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        this.isLiked = liked;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getPostonotherUserId() {
        return postonotherUserId;
    }

    public void setPostonotherUserId(String postonotherUserId) {
        this.postonotherUserId = postonotherUserId;
    }

    public Integer getPrivacy() {
        return privacy;
    }

    public void setPrivacy(int privacy) {
        this.privacy = privacy;
    }

    public List<PostShareViewModel> getPostShares() {
        return postShares;
    }

    public void setPostShares(List<PostShareViewModel> postShares) {
        this.postShares = postShares;
    }

    @Override
    public String toString() {
        return "PostModel{" +
                "authorName='" + authorName + '\'' +
                ", authorProfilePicUrl='" + authorProfilePicUrl + '\'' +
                ", authourId='" + authourId + '\'' +
                ", timespan='" + timespan + '\'' +
                ", authorFarm='" + authorFarm + '\'' +
                ", postText='" + postText + '\'' +
                ", PostImageUrl=" + PostImageUrl +
                ", PostImgstr=" + PostImgstr +
                ", likes=" + likes +
                ", id=" + id +
                ", postComments=" + postComments +
                ", postImages=" + postImages +
                ", farmProfile=" + farmProfile +
                ", isLiked=" + isLiked +
                ", createdDate='" + createdDate + '\'' +
                ", postonotherUserId='" + postonotherUserId + '\'' +
                ", privacy=" + privacy +
                ", postShares=" + postShares +
                '}';
    }

    public class PostShareViewModel
    {
        private int postId;
        private String shareBy;
        private Date sharedDateTime;

        public PostShareViewModel(int postId, String shareBy, Date sharedDateTime) {
            this.postId = postId;
            this.shareBy = shareBy;
            this.sharedDateTime = sharedDateTime;
        }

        public int getPostId() {
            return postId;
        }

        public void setPostId(int postId) {
            this.postId = postId;
        }

        public String getShareBy() {
            return shareBy;
        }

        public void setShareBy(String shareBy) {
            this.shareBy = shareBy;
        }

        public Date getSharedDateTime() {
            return sharedDateTime;
        }

        public void setSharedDateTime(Date sharedDateTime) {
            this.sharedDateTime = sharedDateTime;
        }




        @Override
        public String toString() {
            return "PostShareViewModel{" +
                    "postId=" + postId +
                    ", shareBy='" + shareBy + '\'' +
                    ", sharedDateTime=" + sharedDateTime +
                    '}';
        }
    }

    public class FarmProfileModel {

         private Integer farmProfileId= 0;
         private String userId;
         private String farmName;
         private String[] animals;
         private String  operatingSince;
         private String overview;
         private String street;
         private String city;
         private String state;
         private String country;
         private String zip;
         private boolean isTransportationProvider = true;
         private String farmLogo;
         private String farmLogoPath;

        public FarmProfileModel(Integer farmProfileId, String userId, String farmName, String[] animals, String operatingSince, String overview, String street, String city, String state, String country, String zip, boolean isTransportationProvider, String farmLogo, String farmLogoPath) {
            this.farmProfileId = farmProfileId;
            this.userId = userId;
            this.farmName = farmName;
            this.animals = animals;
            this.operatingSince = operatingSince;
            this.overview = overview;
            this.street = street;
            this.city = city;
            this.state = state;
            this.country = country;
            this.zip = zip;
            this.isTransportationProvider = isTransportationProvider;
            this.farmLogo = farmLogo;
            this.farmLogoPath = farmLogoPath;
        }

        public Integer getFarmProfileId() {
            return farmProfileId;
        }

        public void setFarmProfileId(Integer farmProfileId) {
            this.farmProfileId = farmProfileId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getFarmName() {
            return farmName;
        }

        public void setFarmName(String farmName) {
            this.farmName = farmName;
        }

        public String[] getAnimals() {
            return animals;
        }

        public void setAnimals(String[] animals) {
            this.animals = animals;
        }

        public String getOperatingSince() {
            return operatingSince;
        }

        public void setOperatingSince(String operatingSince) {
            this.operatingSince = operatingSince;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public boolean isTransportationProvider() {
            return isTransportationProvider;
        }

        public void setTransportationProvider(boolean transportationProvider) {
            isTransportationProvider = transportationProvider;
        }

        public String getFarmLogo() {
            return farmLogo;
        }

        public void setFarmLogo(String farmLogo) {
            this.farmLogo = farmLogo;
        }

        public String getFarmLogoPath() {
            return farmLogoPath;
        }

        public void setFarmLogoPath(String farmLogoPath) {
            this.farmLogoPath = farmLogoPath;
        }

        @Override
        public String toString() {
            return "FarmProfileModel{" +
                    "farmProfileId=" + farmProfileId +
                    ", userId='" + userId + '\'' +
                    ", farmName='" + farmName + '\'' +
                    ", animals=" + Arrays.toString(animals) +
                    ", operatingSince='" + operatingSince + '\'' +
                    ", overview='" + overview + '\'' +
                    ", street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", country='" + country + '\'' +
                    ", zip='" + zip + '\'' +
                    ", isTransportationProvider=" + isTransportationProvider +
                    ", farmLogo='" + farmLogo + '\'' +
                    ", farmLogoPath='" + farmLogoPath + '\'' +
                    '}';
        }
    }

    public class PostImageViemodel {
       private Integer id = 0;
       private String fileName;
       private Integer postId = 0;

        public PostImageViemodel(Integer id, String fileName, Integer postId) {
            this.id = id;
            this.fileName = fileName;
            this.postId = postId;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public Integer getPostId() {
            return postId;
        }

        public void setPostId(Integer postId) {
            this.postId = postId;
        }

        @Override
        public String toString() {
            return "PostImageViemodel{" +
                    "id=" + id +
                    ", fileName='" + fileName + '\'' +
                    ", postId=" + postId +
                    '}';
        }
    }

    public class PostCommentsViewModel {
      private Integer commentId =  0;
      private String comment;
      private String  author;
      private String authorProfileUrl;
      private String timeStamp;
      private Integer likes = 0;
      private boolean isLiked ;
      private String commentAuthorId;

        public PostCommentsViewModel(Integer commentId, String comment, String author, String authorProfileUrl, String timeStamp, Integer likes, boolean isLiked, String commentAuthorId) {
            this.commentId = commentId;
            this.comment = comment;
            this.author = author;
            this.authorProfileUrl = authorProfileUrl;
            this.timeStamp = timeStamp;
            this.likes = likes;
            this.isLiked = isLiked;
            this.commentAuthorId = commentAuthorId;
        }

        public Integer getCommentId() {
            return commentId;
        }

        public void setCommentId(Integer commentId) {
            this.commentId = commentId;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthorProfileUrl() {
            return authorProfileUrl;
        }

        public void setAuthorProfileUrl(String authorProfileUrl) {
            this.authorProfileUrl = authorProfileUrl;
        }

        public String getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
        }

        public Integer getLikes() {
            return likes;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
        }

        public boolean isLiked() {
            return isLiked;
        }

        public void setLiked(boolean liked) {
            isLiked = liked;
        }

        public String getCommentAuthorId() {
            return commentAuthorId;
        }

        public void setCommentAuthorId(String commentAuthorId) {
            this.commentAuthorId = commentAuthorId;
        }

        @Override
        public String toString() {
            return "PostCommentsViewModel{" +
                    "commentId=" + commentId +
                    ", comment='" + comment + '\'' +
                    ", author='" + author + '\'' +
                    ", authorProfileUrl='" + authorProfileUrl + '\'' +
                    ", timeStamp='" + timeStamp + '\'' +
                    ", likes=" + likes +
                    ", isLiked=" + isLiked +
                    ", commentAuthorId='" + commentAuthorId + '\'' +
                    '}';
        }
    }
}
