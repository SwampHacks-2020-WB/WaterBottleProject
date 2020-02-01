//MapViewContainer

import {compose, withState } from 'recompose';

import MapScreen from './MapView';

export default compose(withState('isExtended', 'setIsExtended', false))(
  HomeScreen,
  );