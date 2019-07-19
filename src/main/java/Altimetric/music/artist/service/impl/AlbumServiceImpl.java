package Altimetric.music.artist.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Altimetric.music.artist.domain.Album;
import Altimetric.music.artist.microservice.AlbumProxy;
import Altimetric.music.artist.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService  {

	@Autowired
	private AlbumProxy albumProxy;

	@Override
	public Album getTopAlbum(String country) {
		return albumProxy.getTopAlbum(country);
	}

}
