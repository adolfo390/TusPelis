package com.example.tuspelis.Buscador;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class PeliculasBuscar implements Parcelable {

    String poster_path, original_language, original_title, title, overview, release_date;
    double popularity, vote_average;
    int vote_count, id;
    boolean adult, video;
    List<Integer> genre_ids;

    public PeliculasBuscar(String poster_path, String original_language, String original_title, String title, String overview, String release_date, double popularity, double vote_average, int vote_count, int id, boolean adult, List<Integer> genre_ids) {
        this.poster_path = poster_path;
        this.original_language = original_language;
        this.original_title = original_title;
        this.title = title;
        this.overview = overview;
        this.release_date = release_date;
        this.popularity = popularity;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
        this.id = id;
        this.adult = adult;
        this.genre_ids = genre_ids;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    protected PeliculasBuscar(Parcel in) {
        poster_path = in.readString();
        original_language = in.readString();
        original_title = in.readString();
        title = in.readString();
        overview = in.readString();
        release_date = in.readString();
        popularity = in.readDouble();
        vote_average = in.readDouble();
        vote_count = in.readInt();
        id = in.readInt();
        adult = in.readByte() != 0;
    }

    public static final Creator<PeliculasBuscar> CREATOR = new Creator<PeliculasBuscar>() {
        @Override
        public PeliculasBuscar createFromParcel(Parcel in) {
            return new PeliculasBuscar(in);
        }

        @Override
        public PeliculasBuscar[] newArray(int size) {
            return new PeliculasBuscar[size];
        }
    };

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public List<Integer> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(poster_path);
        dest.writeString(original_language);
        dest.writeString(original_title);
        dest.writeString(title);
        dest.writeString(overview);
        dest.writeString(release_date);
        dest.writeDouble(popularity);
        dest.writeDouble(vote_average);
        dest.writeInt(vote_count);
        dest.writeInt(id);
        dest.writeByte((byte) (adult ? 1 : 0));
    }
}

