package Altimetric.music.artist.service;

import org.springframework.context.annotation.PropertySource;

import Altimetric.music.artist.domain.Album;

@PropertySource("classpath:music_api.properties")
public interface AlbumService {

	/**
	 * Get top album last week in country
	 * 
	 * @param country
	 * @return {@link Album}
	 */
	Album getTopAlbum(String country);
}
