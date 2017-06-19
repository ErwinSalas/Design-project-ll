package com.example.pavilion.designprojectll_v2.RequestsViews;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pavilion.designprojectll_v2.Adapters.ListViewDepartmentAdapter;
import com.example.pavilion.designprojectll_v2.Adapters.ListViewRequestsAdapter;
import com.example.pavilion.designprojectll_v2.R;

import Controllers.DepartmentController;
import Controllers.RentRequestController;
import Provider.GlobalsProvider;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link IndexRequestsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class IndexRequestsFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    ListViewRequestsAdapter adapter;
    RentRequestController controller;
    public IndexRequestsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_index_requests, container, false);
        controller=new RentRequestController();
        controller.getListFilterByOwner(GlobalsProvider.AuthUser.getId());
        ListView list = (ListView) rootView.findViewById(R.id.listViewRequests);
        adapter=new ListViewRequestsAdapter(this.getActivity(), GlobalsProvider.requestsList);
        list.setAdapter(adapter);
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
