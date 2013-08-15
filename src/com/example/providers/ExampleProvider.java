package com.example.providers;

import java.util.logging.Logger;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class ExampleProvider extends AbsExampleProvider {

	private static SQLiteDatabase sDatabase;

	public static final class Uris extends AbsFanaticsContentProvider.Uris {
		// add any additional Uris
		public static final Uri CARTVIEW_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.CARTVIEW);
		public static final Uri CARTITEM_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.CARTITEM);
		public static final Uri LEAGUES_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.LEAGUES);
		public static final Uri TEAMCATEGORIES_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.TEAMCATEGORIES);
		public static final Uri SEARCH_QUERY_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.SEARCH_PRODUCTS);
		public static final Uri CHALLENGES_VIEW_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.CHALLENGES_VIEW);
		public static final Uri ETAG_URI = Uri.parse("content://" + AUTHORITY
				+ "/" + Paths.ETAG);
		public static final Uri FAVORITE_TEAM_VIEW_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.FAVORITE_TEAM_VIEW);
		public static final Uri SEARCH_QUERY_RESULTS_URI = Uri
				.parse("content://" + AUTHORITY + "/"
						+ Paths.SEARCH_QUERY_RESULTS);
		public static final Uri ADDRESSES_URI = Uri.parse("content://"
				+ AUTHORITY + "/" + Paths.ADDRESSES);
	}

	public static final class Paths extends AbsFanaticsContentProvider.Paths {
		// add any additional Paths
		public static final String CARTVIEW = "cartview";
		public static final String CATEGORIESVIEW = "categoriesview";
		public static final String CARTITEM = "cartitem";
		public static final String LEAGUES = "leagues";
		public static final String TEAMCATEGORIES = "teamcategories";
		public static final String SEARCH_PRODUCTS = "search_products";
		public static final String CHALLENGES_VIEW = "challenges_view";
		public static final String ETAG = "etag";
		public static final String NONE = "none";
		public static final String SEARCH_QUERY = "search_query";
		public static final String FAVORITE_TEAM_VIEW = "favorite_team_view";
		public static final String SEARCH_QUERY_RESULTS = "search_query_results";
		public static final String ADDRESSES = "addresses";
	}

	@Override
	public boolean onCreate() {
		super.onCreate();
		// register any additional data sets
		registerDataset(AUTHORITY, Paths.CARTITEM, CartItemTable.class,
				CartItemListValidator.class);
		registerDataset(AUTHORITY, Paths.CARTVIEW, CartView.class,
				CartItemViewListValidator.class);
		registerDataset(AUTHORITY, Paths.LEAGUES, LeagueTable.class,
				LeagueValidator.class);
		registerDataset(AUTHORITY, Paths.TEAMCATEGORIES,
				TeamCategoriesTable.class, CategoryListValidator.class);
		registerDataset(AUTHORITY, Paths.CATEGORIESVIEW, CategoriesView.class,
				CategoryListValidator.class);
		registerDataset(AUTHORITY, Paths.SEARCH_PRODUCTS,
				SearchProductsView.class, SearchProductsValidator.class);
		registerDataset(AUTHORITY, Paths.CHALLENGES_VIEW, ChallengesView.class,
				ChallengesViewValidator.class);
		registerDataset(AUTHORITY, Paths.NONE, SearchProductsTable.class,
				SearchProductsValidator.class);
		registerDataset(AUTHORITY, Paths.SEARCH_QUERY, SearchQueryTable.class,
				NullValidator.class);
		registerDataset(AUTHORITY, Paths.ETAG, ETagTable.class,
				NullValidator.class);
		registerDataset(AUTHORITY, Paths.FAVORITE_TEAM_VIEW,
				FavoriteTeamView.class, FavoriteTeamViewValidator.class);
		registerDataset(AUTHORITY, Paths.SEARCH_QUERY_RESULTS,
				SearchResultsView.class, NullValidator.class);
		registerDataset(AUTHORITY, Paths.ADDRESSES, UserAddressTable.class,
				UserAddressValidator.class);
		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		// TODO Remove this logging before launch!
		/*
		 * The logic in this method is here simply for debugging during
		 * development. It allows us to look through the logs on debug builds to
		 * see what URIs were requested.
		 * 
		 * This logging logic and String building must be removed before launch.
		 */
		StringBuilder projectionString = new StringBuilder();
		StringBuilder selectionArgsString = new StringBuilder();

		if (projection != null) {
			for (String p : projection) {
				projectionString.append(p + ", ");
			}
		}
		if (selectionArgs != null) {
			for (String sa : selectionArgs) {
				selectionArgsString.append(sa + ", ");
			}
		}

		Logger.d("Query received! URI: " + uri + ", Projection: "
				+ projectionString.toString() + ", Selection: " + selection
				+ ", Selection Args: " + selectionArgsString.toString()
				+ ", Sort order: " + sortOrder);

		Cursor cursor = super.query(uri, projection, selection, selectionArgs,
				sortOrder);

		Logger.d("Entries in returned cursor: " + cursor.getCount());
		return cursor;
	}

	@Override
	protected synchronized SQLiteDatabase getDatabase() {
		if (sDatabase == null) {
			sDatabase = super.getDatabase();
		}
		return super.getDatabase();
	}

	public static SQLiteDatabase getSQLiteDatabase() {
		return sDatabase;
	}
}
