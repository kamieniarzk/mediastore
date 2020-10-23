package com.example.mediastore.bucket;

public enum BucketName {
    BUCKET_NAME("kamieniarzk-mediastore");
    public final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
