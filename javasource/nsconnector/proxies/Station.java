// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nsconnector.proxies;

public class Station
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject stationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NSConnector.Station";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Code("Code"),
		_Type("_Type"),
		Land("Land"),
		UICCode("UICCode"),
		Lat("Lat"),
		Lon("Lon"),
		Station_Stations("NSConnector.Station_Stations"),
		Namen_Station("NSConnector.Namen_Station");

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

	public Station(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NSConnector.Station"));
	}

	protected Station(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject stationMendixObject)
	{
		if (stationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NSConnector.Station", stationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NSConnector.Station");

		this.stationMendixObject = stationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Station.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static nsconnector.proxies.Station initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nsconnector.proxies.Station.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static nsconnector.proxies.Station initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nsconnector.proxies.Station(context, mendixObject);
	}

	public static nsconnector.proxies.Station load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nsconnector.proxies.Station.initialize(context, mendixObject);
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
	 * @return value of Code
	 */
	public final String getCode()
	{
		return getCode(getContext());
	}

	/**
	 * @param context
	 * @return value of Code
	 */
	public final String getCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Code.toString());
	}

	/**
	 * Set value of Code
	 * @param code
	 */
	public final void setCode(String code)
	{
		setCode(getContext(), code);
	}

	/**
	 * Set value of Code
	 * @param context
	 * @param code
	 */
	public final void setCode(com.mendix.systemwideinterfaces.core.IContext context, String code)
	{
		getMendixObject().setValue(context, MemberNames.Code.toString(), code);
	}

	/**
	 * @return value of _Type
	 */
	public final String get_Type()
	{
		return get_Type(getContext());
	}

	/**
	 * @param context
	 * @return value of _Type
	 */
	public final String get_Type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames._Type.toString());
	}

	/**
	 * Set value of _Type
	 * @param _type
	 */
	public final void set_Type(String _type)
	{
		set_Type(getContext(), _type);
	}

	/**
	 * Set value of _Type
	 * @param context
	 * @param _type
	 */
	public final void set_Type(com.mendix.systemwideinterfaces.core.IContext context, String _type)
	{
		getMendixObject().setValue(context, MemberNames._Type.toString(), _type);
	}

	/**
	 * @return value of Land
	 */
	public final String getLand()
	{
		return getLand(getContext());
	}

	/**
	 * @param context
	 * @return value of Land
	 */
	public final String getLand(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Land.toString());
	}

	/**
	 * Set value of Land
	 * @param land
	 */
	public final void setLand(String land)
	{
		setLand(getContext(), land);
	}

	/**
	 * Set value of Land
	 * @param context
	 * @param land
	 */
	public final void setLand(com.mendix.systemwideinterfaces.core.IContext context, String land)
	{
		getMendixObject().setValue(context, MemberNames.Land.toString(), land);
	}

	/**
	 * @return value of UICCode
	 */
	public final String getUICCode()
	{
		return getUICCode(getContext());
	}

	/**
	 * @param context
	 * @return value of UICCode
	 */
	public final String getUICCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.UICCode.toString());
	}

	/**
	 * Set value of UICCode
	 * @param uiccode
	 */
	public final void setUICCode(String uiccode)
	{
		setUICCode(getContext(), uiccode);
	}

	/**
	 * Set value of UICCode
	 * @param context
	 * @param uiccode
	 */
	public final void setUICCode(com.mendix.systemwideinterfaces.core.IContext context, String uiccode)
	{
		getMendixObject().setValue(context, MemberNames.UICCode.toString(), uiccode);
	}

	/**
	 * @return value of Lat
	 */
	public final String getLat()
	{
		return getLat(getContext());
	}

	/**
	 * @param context
	 * @return value of Lat
	 */
	public final String getLat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Lat.toString());
	}

	/**
	 * Set value of Lat
	 * @param lat
	 */
	public final void setLat(String lat)
	{
		setLat(getContext(), lat);
	}

	/**
	 * Set value of Lat
	 * @param context
	 * @param lat
	 */
	public final void setLat(com.mendix.systemwideinterfaces.core.IContext context, String lat)
	{
		getMendixObject().setValue(context, MemberNames.Lat.toString(), lat);
	}

	/**
	 * @return value of Lon
	 */
	public final String getLon()
	{
		return getLon(getContext());
	}

	/**
	 * @param context
	 * @return value of Lon
	 */
	public final String getLon(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Lon.toString());
	}

	/**
	 * Set value of Lon
	 * @param lon
	 */
	public final void setLon(String lon)
	{
		setLon(getContext(), lon);
	}

	/**
	 * Set value of Lon
	 * @param context
	 * @param lon
	 */
	public final void setLon(com.mendix.systemwideinterfaces.core.IContext context, String lon)
	{
		getMendixObject().setValue(context, MemberNames.Lon.toString(), lon);
	}

	/**
	 * @return value of Station_Stations
	 */
	public final nsconnector.proxies.Stations getStation_Stations() throws com.mendix.core.CoreException
	{
		return getStation_Stations(getContext());
	}

	/**
	 * @param context
	 * @return value of Station_Stations
	 */
	public final nsconnector.proxies.Stations getStation_Stations(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nsconnector.proxies.Stations result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Station_Stations.toString());
		if (identifier != null)
			result = nsconnector.proxies.Stations.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Station_Stations
	 * @param station_stations
	 */
	public final void setStation_Stations(nsconnector.proxies.Stations station_stations)
	{
		setStation_Stations(getContext(), station_stations);
	}

	/**
	 * Set value of Station_Stations
	 * @param context
	 * @param station_stations
	 */
	public final void setStation_Stations(com.mendix.systemwideinterfaces.core.IContext context, nsconnector.proxies.Stations station_stations)
	{
		if (station_stations == null)
			getMendixObject().setValue(context, MemberNames.Station_Stations.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Station_Stations.toString(), station_stations.getMendixObject().getId());
	}

	/**
	 * @return value of Namen_Station
	 */
	public final nsconnector.proxies.Namen getNamen_Station() throws com.mendix.core.CoreException
	{
		return getNamen_Station(getContext());
	}

	/**
	 * @param context
	 * @return value of Namen_Station
	 */
	public final nsconnector.proxies.Namen getNamen_Station(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nsconnector.proxies.Namen result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Namen_Station.toString());
		if (identifier != null)
			result = nsconnector.proxies.Namen.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Namen_Station
	 * @param namen_station
	 */
	public final void setNamen_Station(nsconnector.proxies.Namen namen_station)
	{
		setNamen_Station(getContext(), namen_station);
	}

	/**
	 * Set value of Namen_Station
	 * @param context
	 * @param namen_station
	 */
	public final void setNamen_Station(com.mendix.systemwideinterfaces.core.IContext context, nsconnector.proxies.Namen namen_station)
	{
		if (namen_station == null)
			getMendixObject().setValue(context, MemberNames.Namen_Station.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Namen_Station.toString(), namen_station.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return stationMendixObject;
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
			final nsconnector.proxies.Station that = (nsconnector.proxies.Station) obj;
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
		return "NSConnector.Station";
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
