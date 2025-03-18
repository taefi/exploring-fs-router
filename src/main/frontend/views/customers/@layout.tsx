import { Outlet } from 'react-router';

export default function CustomersModuleLayout() {
    return (
        <div>
            <h4>Customers Module Layout</h4>
            <div style={{ backgroundColor: 'lightblue', padding: '10px' }}>
                <Outlet />
            </div>
        </div>
    );
}
