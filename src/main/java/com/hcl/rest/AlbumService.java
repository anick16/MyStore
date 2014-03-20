package com.hcl.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.hcl.pojo.Album;

@Path("/albums")
public class AlbumService {

	@GET
	public List<Album> getAlbums() {
		Album album;
		List<Album> AlbumList = new ArrayList<Album>();
		album = new Album();
		album.setReleaseDate(new Date());
		album.setPrice(400.95);
		album.setTitle("The Title Of The CD");
		album.setSinger("ALbum Singer");
		AlbumList.add(album);
		return AlbumList;
	}
}
