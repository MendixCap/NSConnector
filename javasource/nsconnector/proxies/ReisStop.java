// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nsconnector.proxies;

/**
 * Travel stop. Defines the station at a stops of a ReisDeel (section)
 */
public class ReisStop
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject reisStopMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NSConnector.ReisStop";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Naam("Naam"),
		Tijd("Tijd"),
		Spoor("Spoor"),
		ReisStop_ReisDeel("NSConnector.ReisStop_ReisDeel");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ReisStop(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NSConnector.ReisStop"));
	}

	protected ReisStop(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject reisStopMendixObject)
	{
		if (reisStopMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NSConnector.ReisStop", reisStopMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NSConnector.ReisStop");

		this.reisStopMendixObject = reisStopMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReisStop.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static nsconnector.proxies.ReisStop initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nsconnector.proxies.ReisStop.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static nsconnector.proxies.ReisStop initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nsconnector.proxies.ReisStop(context, mendixObject);
	}

	public static nsconnector.proxies.ReisStop load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nsconnector.proxies.ReisStop.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Naam
	 */
	public final String getNaam()
	{
		return getNaam(getContext());
	}

	/**
	 * @param context
	 * @return value of Naam
	 */
	public final String getNaam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Naam.toString());
	}

	/**
	 * Set value of Naam
	 * @param naam
	 */
	public final void setNaam(String naam)
	{
		setNaam(getContext(), naam);
	}

	/**
	 * Set value of Naam
	 * @param context
	 * @param naam
	 */
	public final void setNaam(com.mendix.systemwideinterfaces.core.IContext context, String naam)
	{
		getMendixObject().setValue(context, MemberNames.Naam.toString(), naam);
	}

	/**
	 * @return value of Tijd
	 */
	public final java.util.Date getTijd()
	{
		return getTijd(getContext());
	}

	/**
	 * @param context
	 * @return value of Tijd
	 */
	public final java.util.Date getTijd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Tijd.toString());
	}

	/**
	 * Set value of Tijd
	 * @param tijd
	 */
	public final void setTijd(java.util.Date tijd)
	{
		setTijd(getContext(), tijd);
	}

	/**
	 * Set value of Tijd
	 * @param context
	 * @param tijd
	 */
	public final void setTijd(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date tijd)
	{
		getMendixObject().setValue(context, MemberNames.Tijd.toString(), tijd);
	}

	/**
	 * @return value of Spoor
	 */
	public final String getSpoor()
	{
		return getSpoor(getContext());
	}

	/**
	 * @param context
	 * @return value of Spoor
	 */
	public final String getSpoor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Spoor.toString());
	}

	/**
	 * Set value of Spoor
	 * @param spoor
	 */
	public final void setSpoor(String spoor)
	{
		setSpoor(getContext(), spoor);
	}

	/**
	 * Set value of Spoor
	 * @param context
	 * @param spoor
	 */
	public final void setSpoor(com.mendix.systemwideinterfaces.core.IContext context, String spoor)
	{
		getMendixObject().setValue(context, MemberNames.Spoor.toString(), spoor);
	}

	/**
	 * @return value of ReisStop_ReisDeel
	 */
	public final nsconnector.proxies.ReisDeel getReisStop_ReisDeel() throws com.mendix.core.CoreException
	{
		return getReisStop_ReisDeel(getContext());
	}

	/**
	 * @param context
	 * @return value of ReisStop_ReisDeel
	 */
	public final nsconnector.proxies.ReisDeel getReisStop_ReisDeel(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nsconnector.proxies.ReisDeel result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReisStop_ReisDeel.toString());
		if (identifier != null)
			result = nsconnector.proxies.ReisDeel.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReisStop_ReisDeel
	 * @param reisstop_reisdeel
	 */
	public final void setReisStop_ReisDeel(nsconnector.proxies.ReisDeel reisstop_reisdeel)
	{
		setReisStop_ReisDeel(getContext(), reisstop_reisdeel);
	}

	/**
	 * Set value of ReisStop_ReisDeel
	 * @param context
	 * @param reisstop_reisdeel
	 */
	public final void setReisStop_ReisDeel(com.mendix.systemwideinterfaces.core.IContext context, nsconnector.proxies.ReisDeel reisstop_reisdeel)
	{
		if (reisstop_reisdeel == null)
			getMendixObject().setValue(context, MemberNames.ReisStop_ReisDeel.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReisStop_ReisDeel.toString(), reisstop_reisdeel.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return reisStopMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final nsconnector.proxies.ReisStop that = (nsconnector.proxies.ReisStop) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "NSConnector.ReisStop";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
