import {NavLink} from "react-router";

export default function CustomerListView() {
    return (
        <div>
            <h1>Customers List</h1>
            <NavLink to='/customers/123/edit'>Edit Customer with id = '123'</NavLink>
            <br />
            <NavLink to='/customers/123'>View details of Customer with id = '123'</NavLink>
        </div>
    );
}