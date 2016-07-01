package retrofit.aishwarya.com.sampleretrofit.model;

import com.google.gson.annotations.SerializedName;

public class ProductionCountries {
    @SerializedName("iso_3166_1")
    private String mIsro;
    @SerializedName("name")
    private String mName;

    public String getIso_3166_1() {
        return mIsro;
    }

    public void setIso_3166_1(String iso_3166_1) {
        this.mIsro = iso_3166_1;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
