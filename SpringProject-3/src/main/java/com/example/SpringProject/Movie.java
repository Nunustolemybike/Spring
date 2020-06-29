package com.example.SpringProject;

import javax.persistence.*;

@Entity
@Table(name = "film")

public class Movie {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer film_id;
	@Column(name = "film_titre", nullable = false)
    private String filmtitre;
    private String film_url_affiche;
    private String film_datesortie;
    private String film_duree;
    private Integer film_court;
    private Integer film_anneeproduction;
    private String film_synopsis;
    private Integer film_etoilespresse;
    private Integer film_etoilesspectateurs;
    private Integer film_info;
    private String film_genre;
    private String film_public;
    private String film_remake;
    private String film_titreoriginal;
    private String film_distribuepar;
    public Movie() {
    	
    }
    public Movie (String film_titre, String film_url_affiche, String film_datesortie, String film_duree, Integer film_court, Integer film_anneeproduction, String film_synopsis, Integer film_etoilespresse, Integer film_etoilesspectateurs, Integer film_info, String film_genre, String film_public, String film_remake, String film_titreoriginal, String film_distribuepar) {
       // this.film_id = film_id;
        this.filmtitre = film_titre;
        this.film_url_affiche = film_url_affiche;
        this.film_datesortie = film_datesortie;
        this.film_duree = film_duree;
        this.film_court = film_court;
        this.film_anneeproduction = film_anneeproduction;
        this.film_synopsis = film_synopsis;
        this.film_etoilespresse = film_etoilespresse;
        this.film_etoilesspectateurs = film_etoilesspectateurs;
        this.film_info = film_info;
        this.film_genre = film_genre;
        this.film_public =  film_public;
        this.film_remake =  film_remake;
        this.film_titreoriginal = film_titreoriginal;
        this.film_distribuepar = film_distribuepar;
    }

    public Integer getFilmId() {
        return film_id;
    }
    public void setFilmId(Integer newId) {
        this.film_id = newId;
    }

    public String getFilmTitle() {
        return filmtitre;
    }
    public void setFilmTitre(String newTitre) {
        this.filmtitre = newTitre;
    }

    @Override
    public String toString() {
        return "Film{" +
                ", film_id='" + film_id + '\'' +
                ", film_titre='" + filmtitre + '\'' +
                ", film_etoilespresse='" + film_etoilespresse + '\'' +
                ", film_etoilesspectateurs=" + film_etoilesspectateurs +
                '}';
    }

}
