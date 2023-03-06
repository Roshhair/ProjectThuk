import React from 'react'
import './NameSportsAndType.css'

export const NameSportsAndType = () => {
    return (
        <>
            <div className='name_sports_and_types_div col-6'>
                <div>
                    <input type='text' placeholder='Event Name' className='name_sports_and_types_input' />
                </div>
                <div>
                    <select className='name_sports_and_types_input_select'>
                        <option className='name_sports_and_types_input_options' selected disabled>Select Sport</option>
                        <option className='name_sports_and_types_input_options'>Rushui</option>
                    </select>
                </div>
                <div >
                    <label className='name_sports_and_types_label' htmlFor='startdate'>Start Date</label>
                    <input className='name_sports_and_types_input' id='startdate' type='date' />
                </div>
            </div>
            <div className='name_sports_and_types_div div_red col-6'>
                <div>
                    <div className='name_sports_and_types_list_span'>Event Type</div>
                    <ul className='name_sports_and_types_list '>
                        <li className='name_sports_and_types_list_items'>
                            <input type='radio' name='eventType' className='name_sports_and_types_radio' /><span className='name_sports_and_types_list_span'>Simple</span>
                        </li>
                        <li className='name_sports_and_types_list_items'>
                            <input type='radio' name='eventType' className='name_sports_and_types_radio' /><span className='name_sports_and_types_list_span'>Auction</span>
                        </li>
                        <li className='name_sports_and_types_list_items'>
                            <input type='radio' name='eventType' className='name_sports_and_types_radio' /><span className='name_sports_and_types_list_span'>Tournament</span>
                        </li>
                    </ul>
                </div>
                <div>
                    <label className='name_sports_and_types_label' htmlFor='enddate'>End Date</label>
                    <input className='name_sports_and_types_input' id='enddate' type='date' />
                </div>
            </div>
            <div className='div_red col-12 '>
                <ul className='name_sports_and_types_margin_zero name_sports_and_types_clearfix'>
                    <li className='name_sports_and_types_list_items2 name_sports_and_types_float_right'>
                        <button className='name_sports_and_types_button'>Next</button>
                    </li>
                    <li className='name_sports_and_types_list_items2 name_sports_and_types_float_right'>
                        <button className='name_sports_and_types_button'>Cancel</button>
                    </li>
                </ul>
            </div>
        </>
    )
}
