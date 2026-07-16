package com.mmcoe.songtomovie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="songs")
public class Song 
{
	@Id @Column(name="sid")
	public int sId;
	@Column(name="s_name",length=20)
	public String s_name;
	@Column(length=30)
	public String singer;
	

    @ManyToOne
    @JoinColumn(name = "mid")
    private Movie movie;
	
	public Song() {
	}

	public Song(int sId, String s_name, String singer) {
		this.sId = sId;
		this.s_name = s_name;
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Song [sId=" + sId + ", s_name=" + s_name + ", singer=" + singer + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
}
