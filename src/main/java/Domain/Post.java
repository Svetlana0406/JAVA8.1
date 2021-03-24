package Domain;

public class Post {
    private String text;
    private int commentsInfo;
    private int likesInfo;
    private int views;
    private int repostInfo;
    private int geo;
    private int postId;
    private int ownerId;
    private int authorId;
    private boolean administratorAccess;
    private int administratorId;
    private long date;
    private long time;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String imageUrl;
    private String link;
    private String postType;
    private String postSource;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean postIsPinned;
    private boolean markedAsAds;
    private boolean isFavourite;
    private int postponedId;

    public String getText() { return text; }
    public void setText(String text) {
        this.text = text;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }
    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getLikesInfo() {
        return likesInfo;
    }
    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getRepostInfo() {
        return repostInfo;
    }
    public void setRepostInfo(int repostInfo) {
        this.repostInfo = repostInfo;
    }

    public int getGeo() {
        return geo;
    }
    public void setGeo(int geo) {
        this.geo = geo;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public boolean isAdministratorAccess() {
        return administratorAccess;
    }

    public void setAdministratorAccess(boolean administratorAccess) {
        this.administratorAccess = administratorAccess;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostSource() {
        return postSource;
    }

    public void setPostSource(String postSource) {
        this.postSource = postSource;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPostIsPinned() {
        return postIsPinned;
    }

    public void setPostIsPinned(boolean postIsPinned) {
        this.postIsPinned = postIsPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
