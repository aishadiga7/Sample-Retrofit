package retrofit.aishwarya.com.sampleretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by aishwarya on 23/6/16.
 */
public class MovieResponse {

    @SerializedName("adult")
    private boolean mAdult;
    @SerializedName("backdrop_path")
    private String mBackdropPath;
    @SerializedName("belongs_to_collection")
    private String mBelongsToCollection;
    @SerializedName("budget")
    private int mBudget;
    @SerializedName("genres")
    private List<Genres> mGenres;
    @SerializedName("homepage")
    private String mHomepage;
    @SerializedName("id")
    private int mId;
    @SerializedName("imdb_id")
    private String mImdbId;
    @SerializedName("original_language")
    private String mOriginalLanguage;
    @SerializedName("original_title")
    private String mOriginalTitle;
    @SerializedName("overview")
    private String mOverview;
    @SerializedName("popularity")
    private double mPopularity;
    @SerializedName("poster_path")
    private String mPosterPath;
    @SerializedName("production_companies")
    private List<ProductionCompanies> mProductionCompanies;
    @SerializedName("production_countries")
    private List<ProductionCountries> mProductionCountries;
    @SerializedName("release_date")
    private String mReleaseDate;
    @SerializedName("revenue")
    private int mRevenue;
    @SerializedName("runtime")
    private int mRuntime;
    @SerializedName("spoken_languages")
    private List<SpokenLanguages> mSpokenLanguages;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("tagline")
    private String mTagline;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("video")
    private boolean mVideo;
    @SerializedName("vote_average")
    private double mVoteAverage;
    @SerializedName("vote_count")
    private int mVoteCount;

    public boolean getAdult() {
        return mAdult;
    }

    public void setAdult(boolean adult) {
        this.mAdult = adult;
    }

    public String getBackdropPath() {
        return mBackdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.mBackdropPath = backdropPath;
    }

    public String getBelongsToCollection() {
        return mBelongsToCollection;
    }

    public void setBelongsToCollection(String belongsToCollection) {
        this.mBelongsToCollection = belongsToCollection;
    }

    public int getBudget() {
        return mBudget;
    }

    public void setBudget(int budget) {
        this.mBudget = budget;
    }

    public List<Genres> getGenres() {
        return mGenres;
    }

    public void setGenres(List<Genres> genres) {
        this.mGenres = genres;
    }

    public String getHomepage() {
        return mHomepage;
    }

    public void setHomepage(String homepage) {
        this.mHomepage = homepage;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getImdbId() {
        return mImdbId;
    }

    public void setImdbId(String imdbId) {
        this.mImdbId = imdbId;
    }

    public String getOriginalLanguage() {
        return mOriginalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.mOriginalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return mOriginalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.mOriginalTitle = originalTitle;
    }

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String overview) {
        this.mOverview = overview;
    }

    public double getPopularity() {
        return mPopularity;
    }

    public void setPopularity(double popularity) {
        this.mPopularity = popularity;
    }

    public String getPosterPath() {
        return mPosterPath;
    }

    public void setPosterPath(String poster_path) {
        this.mPosterPath = poster_path;
    }

    public List<ProductionCompanies> getProductionCompanies() {
        return mProductionCompanies;
    }

    public void setProductionCompanies(List<ProductionCompanies> production_companies) {
        this.mProductionCompanies = production_companies;
    }

    public List<ProductionCountries> getProductionCountries() {
        return mProductionCountries;
    }

    public void setProductionCountries(List<ProductionCountries> production_countries) {
        this.mProductionCountries = production_countries;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String release_date) {
        this.mReleaseDate = release_date;
    }

    public int getRevenue() {
        return mRevenue;
    }

    public void setRevenue(int revenue) {
        this.mRevenue = revenue;
    }

    public int getRuntime() {
        return mRuntime;
    }


    public void setRuntime(int runtime) {
        this.mRuntime = runtime;
    }

    public List<SpokenLanguages> getSpokenLanguages() {
        return mSpokenLanguages;
    }

    public void setSpokenLanguages(List<SpokenLanguages> spokenLanguages) {
        this.mSpokenLanguages = spokenLanguages;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        this.mStatus = status;
    }

    public String getTagline() {
        return mTagline;
    }

    public void setTagline(String tagline) {
        this.mTagline = tagline;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public boolean getVideo() {
        return mVideo;
    }

    public void setVideo(boolean video) {
        this.mVideo = video;
    }

    public double getVoteAverage() {
        return mVoteAverage;
    }

    public void setVoteAverage(double vote_average) {
        this.mVoteAverage = vote_average;
    }

    public int getVoteCount() {
        return mVoteCount;
    }

    public void setVoteCount(int vote_count) {
        this.mVoteCount = vote_count;
    }
}
