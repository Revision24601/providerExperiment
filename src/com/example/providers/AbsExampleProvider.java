package com.fanatics.providers;

import android.net.Uri;

import com.fanatics.datasets.CategoryTable;
import com.fanatics.datasets.LeagueTable;
import com.fanatics.datasets.ProductTable;
import com.fanatics.datasets.SearchQueryTable;
import com.fanatics.datasets.ChallengeStatusTable;
import com.fanatics.datasets.LevelTable;
import com.fanatics.datasets.PayPalUrlTable;
import com.fanatics.datasets.ChallengeTable;
import com.fanatics.datasets.SearchResultTable;
import com.fanatics.datasets.ItemTable;
import com.fanatics.datasets.FavoriteTeamTable;
import com.fanatics.datasets.SizeChartTable;
import com.fanatics.datasets.TeamTable;
import com.fanatics.datasets.CartItemTable;
import com.fanatics.datasets.ProductDetailsTable;
import com.fanatics.datasets.ScheduledGameTable;

import com.fanatics.operations.CategoryListValidator;
import com.fanatics.operations.CategoryValidator;
import com.fanatics.operations.LeagueListValidator;
import com.fanatics.operations.LeagueValidator;
import com.fanatics.operations.ProductListValidator;
import com.fanatics.operations.ProductValidator;
import com.fanatics.operations.SearchQueryListValidator;
import com.fanatics.operations.SearchQueryValidator;
import com.fanatics.operations.ChallengeStatusListValidator;
import com.fanatics.operations.ChallengeStatusValidator;
import com.fanatics.operations.LevelListValidator;
import com.fanatics.operations.LevelValidator;
import com.fanatics.operations.PayPalUrlListValidator;
import com.fanatics.operations.PayPalUrlValidator;
import com.fanatics.operations.ChallengeListValidator;
import com.fanatics.operations.ChallengeValidator;
import com.fanatics.operations.SearchResultListValidator;
import com.fanatics.operations.SearchResultValidator;
import com.fanatics.operations.ItemListValidator;
import com.fanatics.operations.ItemValidator;
import com.fanatics.operations.FavoriteTeamListValidator;
import com.fanatics.operations.FavoriteTeamValidator;
import com.fanatics.operations.SizeChartListValidator;
import com.fanatics.operations.SizeChartValidator;
import com.fanatics.operations.TeamListValidator;
import com.fanatics.operations.TeamValidator;
import com.fanatics.operations.CartItemListValidator;
import com.fanatics.operations.CartItemValidator;
import com.fanatics.operations.ProductDetailsListValidator;
import com.fanatics.operations.ProductDetailsValidator;
import com.fanatics.operations.ScheduledGameListValidator;
import com.fanatics.operations.ScheduledGameValidator;

import com.xtreme.rest.providers.RestContentProvider;

public class AbsFanaticsContentProvider extends RestContentProvider {

	public static final String SCHEME = "content";
	public static final String AUTHORITY = "com.fanatics.providers.FanaticsContentProvider";
	
	protected static class Uris {
		public static final Uri CATEGORYS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.CATEGORYS);
		public static final Uri LEAGUES_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.LEAGUES);
		public static final Uri PRODUCTS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.PRODUCTS);
		public static final Uri SEARCHQUERYS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.SEARCHQUERYS);
		public static final Uri CHALLENGESTATUSES_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.CHALLENGESTATUSES);
		public static final Uri LEVELS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.LEVELS);
		public static final Uri PAYPALURLS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.PAYPALURLS);
		public static final Uri CHALLENGES_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.CHALLENGES);
		public static final Uri SEARCHRESULTS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.SEARCHRESULTS);
		public static final Uri ITEMS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.ITEMS);
		public static final Uri FAVORITETEAMS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.FAVORITETEAMS);
		public static final Uri SIZECHARTS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.SIZECHARTS);
		public static final Uri TEAMS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.TEAMS);
		public static final Uri CARTITEMS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.CARTITEMS);
		public static final Uri PRODUCTDETAILSS_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.PRODUCTDETAILSS);
		public static final Uri SCHEDULEDGAMES_URI = Uri.parse(SCHEME + "://" + AUTHORITY + "/" + Paths.SCHEDULEDGAMES);
	}
	
	public static class Paths {
		public static final String CATEGORYS = "categorys";
		public static final String LEAGUES = "leagues";
		public static final String PRODUCTS = "products";
		public static final String SEARCHQUERYS = "searchquerys";
		public static final String CHALLENGESTATUSES = "challengestatuses";
		public static final String LEVELS = "levels";
		public static final String PAYPALURLS = "paypalurls";
		public static final String CHALLENGES = "challenges";
		public static final String SEARCHRESULTS = "searchresults";
		public static final String ITEMS = "items";
		public static final String FAVORITETEAMS = "favoriteteams";
		public static final String SIZECHARTS = "sizecharts";
		public static final String TEAMS = "teams";
		public static final String CARTITEMS = "cartitems";
		public static final String PRODUCTDETAILSS = "productdetailss";
		public static final String SCHEDULEDGAMES = "scheduledgames";
	}
	
	@Override
	public boolean onCreate() {
        registerDataset(AUTHORITY, Paths.CATEGORYS, CategoryTable.class, CategoryListValidator.class);
		registerDataset(AUTHORITY, Paths.CATEGORYS + "/*", CategoryTable.class, CategoryValidator.class);
        registerDataset(AUTHORITY, Paths.LEAGUES, LeagueTable.class, LeagueListValidator.class);
		registerDataset(AUTHORITY, Paths.LEAGUES + "/*", LeagueTable.class, LeagueValidator.class);
        registerDataset(AUTHORITY, Paths.PRODUCTS, ProductTable.class, ProductListValidator.class);
		registerDataset(AUTHORITY, Paths.PRODUCTS + "/*", ProductTable.class, ProductValidator.class);
        registerDataset(AUTHORITY, Paths.SEARCHQUERYS, SearchQueryTable.class, SearchQueryListValidator.class);
		registerDataset(AUTHORITY, Paths.SEARCHQUERYS + "/*", SearchQueryTable.class, SearchQueryValidator.class);
        registerDataset(AUTHORITY, Paths.CHALLENGESTATUSES, ChallengeStatusTable.class, ChallengeStatusListValidator.class);
		registerDataset(AUTHORITY, Paths.CHALLENGESTATUSES + "/*", ChallengeStatusTable.class, ChallengeStatusValidator.class);
        registerDataset(AUTHORITY, Paths.LEVELS, LevelTable.class, LevelListValidator.class);
		registerDataset(AUTHORITY, Paths.LEVELS + "/*", LevelTable.class, LevelValidator.class);
        registerDataset(AUTHORITY, Paths.PAYPALURLS, PayPalUrlTable.class, PayPalUrlListValidator.class);
		registerDataset(AUTHORITY, Paths.PAYPALURLS + "/*", PayPalUrlTable.class, PayPalUrlValidator.class);
        registerDataset(AUTHORITY, Paths.CHALLENGES, ChallengeTable.class, ChallengeListValidator.class);
		registerDataset(AUTHORITY, Paths.CHALLENGES + "/*", ChallengeTable.class, ChallengeValidator.class);
        registerDataset(AUTHORITY, Paths.SEARCHRESULTS, SearchResultTable.class, SearchResultListValidator.class);
		registerDataset(AUTHORITY, Paths.SEARCHRESULTS + "/*", SearchResultTable.class, SearchResultValidator.class);
        registerDataset(AUTHORITY, Paths.ITEMS, ItemTable.class, ItemListValidator.class);
		registerDataset(AUTHORITY, Paths.ITEMS + "/*", ItemTable.class, ItemValidator.class);
        registerDataset(AUTHORITY, Paths.FAVORITETEAMS, FavoriteTeamTable.class, FavoriteTeamListValidator.class);
		registerDataset(AUTHORITY, Paths.FAVORITETEAMS + "/*", FavoriteTeamTable.class, FavoriteTeamValidator.class);
        registerDataset(AUTHORITY, Paths.SIZECHARTS, SizeChartTable.class, SizeChartListValidator.class);
		registerDataset(AUTHORITY, Paths.SIZECHARTS + "/*", SizeChartTable.class, SizeChartValidator.class);
        registerDataset(AUTHORITY, Paths.TEAMS, TeamTable.class, TeamListValidator.class);
		registerDataset(AUTHORITY, Paths.TEAMS + "/*", TeamTable.class, TeamValidator.class);
        registerDataset(AUTHORITY, Paths.CARTITEMS, CartItemTable.class, CartItemListValidator.class);
		registerDataset(AUTHORITY, Paths.CARTITEMS + "/*", CartItemTable.class, CartItemValidator.class);
        registerDataset(AUTHORITY, Paths.PRODUCTDETAILSS, ProductDetailsTable.class, ProductDetailsListValidator.class);
		registerDataset(AUTHORITY, Paths.PRODUCTDETAILSS + "/*", ProductDetailsTable.class, ProductDetailsValidator.class);
        registerDataset(AUTHORITY, Paths.SCHEDULEDGAMES, ScheduledGameTable.class, ScheduledGameListValidator.class);
		registerDataset(AUTHORITY, Paths.SCHEDULEDGAMES + "/*", ScheduledGameTable.class, ScheduledGameValidator.class);
		return true;
	}
}