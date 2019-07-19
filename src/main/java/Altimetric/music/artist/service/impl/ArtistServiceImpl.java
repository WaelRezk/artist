package Altimetric.music.artist.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Altimetric.music.artist.domain.Artist;
import Altimetric.music.artist.microservice.ArtistProxy;
import Altimetric.music.artist.service.ArtistService;
@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistProxy artistProxy;

	@Override
	public Artist getArtistInfo(String artistName)  {
		return artistProxy.getArtistInfo(artistName);
	}

}
