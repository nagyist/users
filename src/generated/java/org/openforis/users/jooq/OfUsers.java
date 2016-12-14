/**
 * This class is generated by jOOQ
 */
package org.openforis.users.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.openforis.users.jooq.Sequences;
import org.openforis.users.jooq.tables.User;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OfUsers extends SchemaImpl {

	private static final long serialVersionUID = 1655699878;

	/**
	 * The reference instance of <code>OF_USERS</code>
	 */
	public static final OfUsers OF_USERS = new OfUsers();

	/**
	 * No further instances allowed
	 */
	private OfUsers() {
		super("OF_USERS");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.SYSTEM_SEQUENCE_7C68AB98_C24F_44C2_961B_533AB2C90729);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			User.USER);
	}
}
