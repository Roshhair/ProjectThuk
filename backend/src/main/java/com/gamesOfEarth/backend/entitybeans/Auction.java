package com.gamesOfEarth.backend.entitybeans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="auctions")
public class Auction {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(nullable = true)
	private int soldAt;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="player_id",nullable = true)
	@JsonIgnore
	private Player player;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="manager_id",nullable = true)
	@JsonIgnore
	private Manager manager;
	public Auction() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoldAt() {
		return soldAt;
	}
	public void setSoldAt(int soldAt) {
		this.soldAt = soldAt;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Auction [id=" + id + ", soldAt=" + soldAt + ", player=" + player + ", manager=" + manager + "]";
	}
	public Auction(int id, int soldAt, Player player, Manager manager) {
		super();
		this.id = id;
		this.soldAt = soldAt;
		this.player = player;
		this.manager = manager;
	}
	
	
}
