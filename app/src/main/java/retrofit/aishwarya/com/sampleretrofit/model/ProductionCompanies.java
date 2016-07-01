package retrofit.aishwarya.com.sampleretrofit.model;

import com.google.gson.annotations.SerializedName;

public class ProductionCompanies {
    @SerializedName("name")
    private String mName;
    @SerializedName("id")
    private int mId;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }
}
