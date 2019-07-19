package Altimetric.music.artist.microservice;

import Altimetric.music.artist.domain.Artist;

/**
 * ArtistProxy is a <b>microservcie</b> responsible for interaction with music
 * API's and return artist info
 * 
 *
 */
public interface ArtistProxy {

	/**
	 * Get artist info from music API by artist first name, last name or full name
	 * 
	 * @param artistName
	 * @return {@link Artist}
	 */
	Artist getArtistInfo(String artistName) ;

}
