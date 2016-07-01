package retrofit.aishwarya.com.sampleretrofit.model;

import com.google.gson.annotations.SerializedName;

public class SpokenLanguages {
    @SerializedName("iso_639_1")
    private String mIsro639;
    @SerializedName("name")
    private String mName;

    public String getIso_639_1() {
        return mIsro639;
    }

    public void setIso_639_1(String iso_639_1) {
        this.mIsro639 = iso_639_1;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
