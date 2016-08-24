// This file was generated by Mendix Modeler 6.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static nsconnector.proxies.Departures dS_GetLiveUpdatesUtrechtLR(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DS_GetLiveUpdatesUtrechtLR", params);
			return result == null ? null : nsconnector.proxies.Departures.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteStations(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_DeleteStations", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GetStations(IContext context, myfirstmodule.proxies.Request _request)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Request", _request == null ? null : _request.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_GetStations", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_InitiateTravelPlanner(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_InitiateTravelPlanner", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_PlanTravel(IContext context, myfirstmodule.proxies.Request _request)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Request", _request == null ? null : _request.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_PlanTravel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_RetrieveStationList(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_RetrieveStationList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SelectSingleStation(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_SelectSingleStation", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SelectStations(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_SelectStations", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ShowTravelPlan(IContext context, nsconnector.proxies.ReisMogelijkheid _reisMogelijkheid)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ReisMogelijkheid", _reisMogelijkheid == null ? null : _reisMogelijkheid.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_ShowTravelPlan", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_StationDetails(IContext context, nsconnector.proxies.Station _station)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Station", _station == null ? null : _station.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_StationDetails", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_TestConnector(IContext context, myfirstmodule.proxies.Request _request)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Request", _request == null ? null : _request.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_TestConnector", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_TestLiveDeparturesConnector(IContext context, myfirstmodule.proxies.Request _request)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Request", _request == null ? null : _request.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_TestLiveDeparturesConnector", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}