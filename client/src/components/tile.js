import React from 'react'
// import { inject, observer } from 'mobx-react'

export default class Tile extends React.Component{
  /**
   * Construct and set initial state for Tile component
   * @constructor
   * @param  {Object} props - properties for this component
   */
  constructor(props) {
  	super(props);

  	// TODO: enabled state based on store value
  	this.state = {
  		enabled: true,
  		active: false,
  	}
  }

  /**
   * Close tile making it no longer active
   */
  close(){
  	this.setState({active: false});
  }

  /**
   * Open tile making it active
   */
  open(){
  	this.setState({active: true});
  }

  /**
   * Modify scores then disable and close the tile 
   */
  end(){
  	this.setState({disabled: true});
  	this.close();
  }

  /** @type {String} class used for a disabled tile */
  disabledClassModifier: 'tile--disabled'

  /**
   * Get className modifiers for tile components based on available props
   * @return {String} - extension of class names 
   */
  getModifiers(){
  	let classNames = this.props.classModifier || '';

  	if(this.state.enabled === false){
  		classNames += this.disabledClassModifier;
  	}

  	return classNames;
  }

  /**
   * Render component markup
   * @return {Object} JSX markup
   */
  render() {
	return (
		<div className={'tile ' + this.getModifiers()}>
			<div className="tile__value">
				{this.props.value}
			</div>
		</div>
	);
  }
}
