package Altimetric.music.artist.service;

import org.springframework.context.annotation.PropertySource;

import Altimetric.music.artist.domain.Artist;

@PropertySource("classpath:music_api.properties")
public interface ArtistService {

	/**
	 * Get artist info using artist first name, last name or full name
	 * 
	 * @param artistName
	 * @return {@link Artist}
	 */
	Artist getArtistInfo(String artistName);

}
